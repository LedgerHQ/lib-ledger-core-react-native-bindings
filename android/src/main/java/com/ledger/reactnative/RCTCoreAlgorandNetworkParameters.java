// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

package com.ledger.reactnative;

import co.ledger.core.AlgorandNetworkParameters;
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
import com.facebook.react.module.annotations.ReactModule;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;
import java.util.UUID;

@ReactModule(name = "RCTCoreAlgorandNetworkParameters")
public class RCTCoreAlgorandNetworkParameters extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, AlgorandNetworkParameters> javaObjects;
    public Map<String, AlgorandNetworkParameters> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreAlgorandNetworkParameters(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, AlgorandNetworkParameters>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreAlgorandNetworkParameters";
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
            promise.reject("Failed to release instance of RCTCoreAlgorandNetworkParameters", "First parameter of RCTCoreAlgorandNetworkParameters::release should be an instance of RCTCoreAlgorandNetworkParameters");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, AlgorandNetworkParameters> elem : this.javaObjects.entrySet())
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
    @ReactMethod
    public void isNull(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (this.javaObjects.get(uid) == null)
            {
                promise.resolve(true);
                return;
            }
            else
            {
                promise.resolve(false);
                return;
            }
        }
        promise.resolve(true);
    }

    @ReactMethod
    public void init(String genesisID, String genesisHash, Promise promise) {
        AlgorandNetworkParameters javaResult = new AlgorandNetworkParameters(genesisID, genesisHash);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreAlgorandNetworkParameters");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
    }
    @ReactMethod
    public void getGenesisID(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            AlgorandNetworkParameters javaObj = this.javaObjects.get(uid);
            String result = javaObj.getGenesisID();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreAlgorandNetworkParameters::getGenesisID", "First parameter of RCTCoreAlgorandNetworkParameters::getGenesisID should be an instance of RCTCoreAlgorandNetworkParameters");
        }
    }

    @ReactMethod
    public void getGenesisHash(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            AlgorandNetworkParameters javaObj = this.javaObjects.get(uid);
            String result = javaObj.getGenesisHash();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreAlgorandNetworkParameters::getGenesisHash", "First parameter of RCTCoreAlgorandNetworkParameters::getGenesisHash should be an instance of RCTCoreAlgorandNetworkParameters");
        }
    }

}
