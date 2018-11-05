// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from thread_dispatcher.djinni

package com.ledger.reactnative;

import co.ledger.core.ExecutionContext;
import co.ledger.core.Runnable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Class representing context in which tasks get executed */
public class RCTCoreExecutionContext extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, ExecutionContextImpl> javaObjects;
    public Map<String, ExecutionContextImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreExecutionContext(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, ExecutionContextImpl>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreExecutionContext";
    }
    @ReactMethod
    public void newInstance(Promise promise)
    {
        ExecutionContextImpl newInstance = new ExecutionContextImpl(this.reactContext);
        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, newInstance);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreExecutionContext");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
    }
    @ReactMethod
    public void release(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCoreExecutionContext", "First parameter of RCTCoreExecutionContext::release should be an instance of RCTCoreExecutionContext");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, ExecutionContextImpl> elem : this.javaObjects.entrySet())
        {
            result.pushString(elem.getKey());
        }
        promise.resolve(result);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }

    /**
     *Execute a given runnable
     *@param runnalbe, Runnable object
     */
    @ReactMethod
    public void execute(ReadableMap currentInstance, ReadableMap runnable, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            ExecutionContextImpl currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreRunnable rctParam_runnable = this.reactContext.getNativeModule(RCTCoreRunnable.class);
            Runnable javaParam_0 = rctParam_runnable.getJavaObjects().get(runnable.getString("uid"));
            currentInstanceObj.execute(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Execute a given runnable with a delay
     *@param runnalbe, Runnable object
     *@param millis, 64 bits integer, delay in milli-seconds
     */
    @ReactMethod
    public void delay(ReadableMap currentInstance, ReadableMap runnable, long millis, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            ExecutionContextImpl currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreRunnable rctParam_runnable = this.reactContext.getNativeModule(RCTCoreRunnable.class);
            Runnable javaParam_0 = rctParam_runnable.getJavaObjects().get(runnable.getString("uid"));
            currentInstanceObj.delay(javaParam_0, millis);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
