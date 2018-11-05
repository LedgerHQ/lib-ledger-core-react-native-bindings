// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.ExtendedKeyAccountCreationInfo;
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

/**TODO */
public class RCTCoreExtendedKeyAccountCreationInfo extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, ExtendedKeyAccountCreationInfo> javaObjects;
    public Map<String, ExtendedKeyAccountCreationInfo> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreExtendedKeyAccountCreationInfo(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, ExtendedKeyAccountCreationInfo>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreExtendedKeyAccountCreationInfo";
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
            promise.reject("Failed to release instance of RCTCoreExtendedKeyAccountCreationInfo", "First parameter of RCTCoreExtendedKeyAccountCreationInfo::release should be an instance of RCTCoreExtendedKeyAccountCreationInfo");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, ExtendedKeyAccountCreationInfo> elem : this.javaObjects.entrySet())
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
    public void init(int index, ReadableArray owners, ReadableArray derivations, ReadableArray extendedKeys, Promise promise) {
        ArrayList<String> javaParam_1 = new ArrayList<String>();
        for (int i = 0; i <  owners.size(); i++)
        {
            String owners_elem = owners.getString(i);
            javaParam_1.add(owners_elem);
        }
        ArrayList<String> javaParam_2 = new ArrayList<String>();
        for (int i = 0; i <  derivations.size(); i++)
        {
            String derivations_elem = derivations.getString(i);
            javaParam_2.add(derivations_elem);
        }
        ArrayList<String> javaParam_3 = new ArrayList<String>();
        for (int i = 0; i <  extendedKeys.size(); i++)
        {
            String extendedKeys_elem = extendedKeys.getString(i);
            javaParam_3.add(extendedKeys_elem);
        }
        ExtendedKeyAccountCreationInfo javaResult = new ExtendedKeyAccountCreationInfo(index, javaParam_1, javaParam_2, javaParam_3);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreExtendedKeyAccountCreationInfo");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
    }
    @ReactMethod
    public void getIndex(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            ExtendedKeyAccountCreationInfo javaObj = this.javaObjects.get(uid);
            int result = javaObj.getIndex();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreExtendedKeyAccountCreationInfo::getIndex", "First parameter of RCTCoreExtendedKeyAccountCreationInfo::getIndex should be an instance of RCTCoreExtendedKeyAccountCreationInfo");
        }
    }

    @ReactMethod
    public void getOwners(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            ExtendedKeyAccountCreationInfo javaObj = this.javaObjects.get(uid);
            ArrayList<String> result = javaObj.getOwners();
            WritableNativeArray converted_result = new WritableNativeArray();
            for (String result_elem : result)
            {
                converted_result.pushString(result_elem);
            }
            promise.resolve(converted_result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreExtendedKeyAccountCreationInfo::getOwners", "First parameter of RCTCoreExtendedKeyAccountCreationInfo::getOwners should be an instance of RCTCoreExtendedKeyAccountCreationInfo");
        }
    }

    @ReactMethod
    public void getDerivations(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            ExtendedKeyAccountCreationInfo javaObj = this.javaObjects.get(uid);
            ArrayList<String> result = javaObj.getDerivations();
            WritableNativeArray converted_result = new WritableNativeArray();
            for (String result_elem : result)
            {
                converted_result.pushString(result_elem);
            }
            promise.resolve(converted_result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreExtendedKeyAccountCreationInfo::getDerivations", "First parameter of RCTCoreExtendedKeyAccountCreationInfo::getDerivations should be an instance of RCTCoreExtendedKeyAccountCreationInfo");
        }
    }

    @ReactMethod
    public void getExtendedKeys(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            ExtendedKeyAccountCreationInfo javaObj = this.javaObjects.get(uid);
            ArrayList<String> result = javaObj.getExtendedKeys();
            WritableNativeArray converted_result = new WritableNativeArray();
            for (String result_elem : result)
            {
                converted_result.pushString(result_elem);
            }
            promise.resolve(converted_result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreExtendedKeyAccountCreationInfo::getExtendedKeys", "First parameter of RCTCoreExtendedKeyAccountCreationInfo::getExtendedKeys should be an instance of RCTCoreExtendedKeyAccountCreationInfo");
        }
    }

}
