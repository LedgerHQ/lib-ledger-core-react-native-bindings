package com.ledger.reactnative;

import android.graphics.Bitmap;
import android.os.HandlerThread;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import co.ledger.core.ExecutionContext;
import co.ledger.core.Runnable;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;

/**Class representing context in which tasks get executed */
public class ExecutionContextImpl extends co.ledger.core.ExecutionContext {
    private ReactApplicationContext reactContext;
    private Promise promise;
    private String name;

    private static Queue<co.ledger.core.Runnable> newQueue(ReactApplicationContext reactContext, String name) {
        if (name == "__main__") {
            return new PriorityQueue<co.ledger.core.Runnable>();
        } else {
            return new SynchronousQueue<co.ledger.core.Runnable>();
        }
    }

    public ExecutionContextImpl(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;
        this.name = name;
    }

    public ExecutionContextImpl(ReactApplicationContext reactContext, String name) {
        this.reactContext = reactContext;
        this.name = name;
    }

    public void setPromise(Promise _promise) {
        this.promise = _promise;
    }

    /**
     *Execute a given runnable
     *@param runnalbe, Runnable object
     */

    public void execute(final co.ledger.core.Runnable runnable) {
        int priority = (name == "__main__") ? Thread.MAX_PRIORITY : Thread.NORM_PRIORITY;
        Thread thread = new Thread(new java.lang.Runnable() {
            public void run() {
                runnable.run();
            }
        });
        thread.setPriority(priority);
        thread.start();
    }

    /**
     *Execute a given runnable with a delay
     *@param runnalbe, Runnable object
     *@param millis, 64 bits integer, delay in milli-seconds
     */
    public void delay(final co.ledger.core.Runnable runnable, long millis) {
        int priority = (name == "__main__") ? Thread.MAX_PRIORITY : Thread.NORM_PRIORITY;
        try {
            Thread.sleep(millis);
            Thread thread = new Thread(new java.lang.Runnable() {
                public void run() {
                    runnable.run();
                }
            });
            thread.setPriority(priority);
            thread.start();
        } catch(Exception e) {
            System.err.println(e);
        }
    }
}
