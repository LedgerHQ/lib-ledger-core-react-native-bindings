package com.ledger.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.network.OkHttpClientProvider;

import co.ledger.core.HttpRequest;
import co.ledger.core.Error;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/** Class representing the http client performing the http requests */
public class HttpClientImpl extends co.ledger.core.HttpClient {
    final private ReactApplicationContext reactContext;
    final private OkHttpClient mClient;

    public HttpClientImpl(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;
        this.mClient = OkHttpClientProvider.createClient();
    }

    /**
     *Execute a given Http request\
     *@param httpRequest, HttpRequest object, request to execute
     */
    public void execute(final HttpRequest httpRequest) {
        // essentially inspired from https://github.com/facebook/react-native/blob/master/ReactAndroid/src/main/java/com/facebook/react/modules/network/NetworkingModule.java#L263
        String url = httpRequest.getUrl();
        String method = "GET";
        byte[] body = httpRequest.getBody();
        HashMap<String, String> headers = httpRequest.getHeaders();

        Request.Builder requestBuilder;
        try {
            OkHttpClient.Builder clientBuilder = mClient.newBuilder();
            clientBuilder.connectTimeout(120, TimeUnit.SECONDS);
            OkHttpClient client = clientBuilder.build();
            requestBuilder = new Request.Builder().url(url);
            // Set the headers for the request.
            for (Map.Entry<String, String> header : headers.entrySet()) {
                requestBuilder.addHeader(header.getKey(), header.getValue());
            }

            // Set the body if needed
            if (body.length > 0) {
                method = "POST";
                RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), body);
                requestBuilder.method(method, requestBody);
            }

            // Build the request
            Request request = requestBuilder.build();

            client
            .newCall(request)
            .enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException ex) {
                    Error error = new Error(co.ledger.core.ErrorCode.HTTP_ERROR, ex.getMessage());
                    HttpUrlConnectionImpl urlConnection = new com.ledger.reactnative.HttpUrlConnectionImpl(reactContext, ex.toString(), ex.hashCode(), null, error);
                    httpRequest.complete(urlConnection, error);
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    int httpCode = response.code();
                    // Account for unhappy HTTP responses
                    ResponseBody responseBody = response.body();
                    String data = response.isSuccessful() && responseBody != null? responseBody.string():response.toString();
                    com.ledger.reactnative.HttpUrlConnectionImpl urlConnection = new com.ledger.reactnative.HttpUrlConnectionImpl(reactContext, data, httpCode, headers, null);
                    httpRequest.complete(urlConnection, null);
                }
            });
        } catch (Exception ex) {
            Error error = new Error(co.ledger.core.ErrorCode.HTTP_ERROR, ex.getMessage());
            com.ledger.reactnative.HttpUrlConnectionImpl urlConnection = new com.ledger.reactnative.HttpUrlConnectionImpl(reactContext, ex.toString(), ex.hashCode(), null, error);
            httpRequest.complete(urlConnection, error);
        }
    }
}
