package com.ledger.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;

import co.ledger.core.HttpRequest;
import co.ledger.core.Error;
import co.ledger.core.HttpRequest;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**Class representing the http client performing the http requests */
public class HttpClientImpl extends co.ledger.core.HttpClient {
    private ReactApplicationContext reactContext;

    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 10,25, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(25), Executors.defaultThreadFactory(), new RejectedExecutionHandler() {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println(r.toString() + " is rejected");
        }
    });

    public HttpClientImpl(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;
    }
    /**
     *Execute a giver Http request\
     *@param request, HttpRequest object, requestr to execute
     */
    public void execute(final HttpRequest request) {

        Thread thread = new Thread(new java.lang.Runnable() {
            public void run() {
                try {
                    URL url = new URL(request.getUrl());
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    HashMap<String, String> headers = request.getHeaders();
                    for (String hr : headers.keySet()) {
                        connection.setRequestProperty(hr, headers.get(hr));
                    }

                    byte[] body = request.getBody();
                    if (body.length > 0) {
                        connection.setRequestMethod( "POST" );
						if (!headers.containsKey("Content-Type")) {
							connection.setRequestProperty( "Content-Type", "application/json");
						}
						if (!headers.containsKey("Content-Encoding") && !headers.containsValue("application/x-binary")) {
							connection.setRequestProperty( "Content-Encoding", "UTF-8");
						}
                        connection.setRequestProperty( "Content-Length", Integer.toString(body.length));
                        OutputStream os = connection.getOutputStream();
                        os.write(body);
                        os.flush();
                        os.close();
                    }

                    int httpCode = connection.getResponseCode();
                    String response = getString(httpCode<400 ? connection.getInputStream() : connection.getErrorStream(), "UTF-8");
                    com.ledger.reactnative.HttpUrlConnectionImpl urlConnection = new com.ledger.reactnative.HttpUrlConnectionImpl(reactContext, response, httpCode, headers, null);
                    request.complete(urlConnection, null);
                } catch (Exception ex) {
                    Error error = new Error(co.ledger.core.ErrorCode.HTTP_ERROR, ex.getMessage());
                    com.ledger.reactnative.HttpUrlConnectionImpl urlConnection = new com.ledger.reactnative.HttpUrlConnectionImpl(reactContext, ex.toString(), ex.hashCode(), null, error);
                    request.complete(urlConnection, error);
		} finally {
                    connection.disconnect();
                }
            }
        });

        threadPoolExecutor.execute(thread);
    }

    private static String getString(InputStream stream, String charsetName) throws IOException
    {
        int n = 0;
        char[] buffer = new char[1024 * 4];
        InputStreamReader reader = new InputStreamReader(stream, charsetName);
        StringWriter writer = new StringWriter();
        while (-1 != (n = reader.read(buffer))) {
            writer.write(buffer, 0, n);
        }
        reader.close();
        return writer.toString();
    }
}
