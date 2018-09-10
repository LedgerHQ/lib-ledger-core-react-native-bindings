// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from core.djinni

package com.ledger.reactnative;

import co.ledger.core.LedgerCore;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
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

public class RCTCoreLedgerCore extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, LedgerCore> javaObjects;
    public Map<String, LedgerCore> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreLedgerCore(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, LedgerCore>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreLedgerCore";
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
            promise.reject("Failed to release instance of RCTCoreLedgerCore", "First parameter of RCTCoreLedgerCore::release should be an instance of RCTCoreLedgerCore");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, LedgerCore> elem : this.javaObjects.entrySet())
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
     * Gets the version of the library as a human readable string.
     * @return The version of the library (e.g. '1.0.1')
     */
    @ReactMethod
    public void getStringVersion(Promise promise) {
        try
        {
            String javaResult = LedgerCore.getStringVersion();
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get the integer version of the Library
     * @return The integer version of the library
     */
    @ReactMethod
    public void getIntVersion(Promise promise) {
        try
        {
            int javaResult = LedgerCore.getIntVersion();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
