package com.ledger.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**Class representing a thread dispatcher */
public class ThreadDispatcherImpl extends co.ledger.core.ThreadDispatcher {
    private ReactApplicationContext reactContext;
    private Map<String, com.ledger.reactnative.ExecutionContextImpl> contexts;
    public ThreadDispatcherImpl(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;
        this.contexts = new HashMap<>();
    }

    /**
     *Get an execution context where tasks are executed sequentially
     *@param name, string, name of execution context to retrieve
     *@return ExecutionContext object
     */
    public co.ledger.core.ExecutionContext getSerialExecutionContext(String name) {
        com.ledger.reactnative.ExecutionContextImpl context = this.contexts.get(name);
        if (context == null) {
            context = new com.ledger.reactnative.ExecutionContextImpl(this.reactContext,name);
            this.contexts.put(name, context);
        }
        return context;
    }

    /**
     *Get an execution context where tasks are executed in parallel thanks to a thread pool
     *where a system of inter-thread communication was designed
     *@param name, string, name of execution context to retrieve
     *@return ExecutionContext object
     */
    public co.ledger.core.ExecutionContext getThreadPoolExecutionContext(String name) {

        return getSerialExecutionContext(name);
    }

    /**
     *Get main execution context (generally where tasks that should never get blocked are executed)
     *@return ExecutionContext object
     */
    public co.ledger.core.ExecutionContext getMainExecutionContext() {

        return getSerialExecutionContext("__main__");
    }

    /**
     *Get lock to handle multithreading
     *@return Lock object
     */
    public co.ledger.core.Lock newLock() {
        return null;
    }
}
