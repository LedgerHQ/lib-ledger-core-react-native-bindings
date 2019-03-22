package com.ledger.reactnative;

import android.graphics.Bitmap;
import android.os.HandlerThread;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import co.ledger.core.ExecutionContext;
import co.ledger.core.Runnable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**Class representing context in which tasks get executed */
public class ExecutionContextImpl extends co.ledger.core.ExecutionContext {
    private ReactApplicationContext reactContext;
    private Promise promise;
    ExecutorService pool;

    public ExecutionContextImpl(ReactApplicationContext reactContext, int numberOfThreads) {
        this.reactContext = reactContext;
        pool = Executors.newFixedThreadPool(numberOfThreads);
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//        if (pool )
//            pool.shutdown();
//    }

    public void setPromise(Promise _promise) {
        this.promise = _promise;
    }

    /**
     *Execute a given runnable
     *@param runnalbe, Runnable object
     */

    public void execute(final co.ledger.core.Runnable runnable) {
        pool.execute(new java.lang.Runnable() {
            @Override
            public void run() {
                runnable.run();
            }
        });
    }

    /**
     *Execute a given runnable with a delay
     *@param runnalbe, Runnable object
     *@param millis, 64 bits integer, delay in milli-seconds
     */
    public void delay(final co.ledger.core.Runnable runnable, long millis) {
        throw new java.lang.UnsupportedOperationException("Do not use delay");
    }
}
