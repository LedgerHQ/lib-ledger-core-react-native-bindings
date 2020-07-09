// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from stellar_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.BigInt;
import co.ledger.core.StellarLikeMemo;
import co.ledger.core.StellarLikeMemoType;
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

@ReactModule(name = "RCTCoreStellarLikeMemo")
public class RCTCoreStellarLikeMemo extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, StellarLikeMemo> javaObjects;
    public Map<String, StellarLikeMemo> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreStellarLikeMemo(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, StellarLikeMemo>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreStellarLikeMemo";
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
            promise.reject("Failed to release instance of RCTCoreStellarLikeMemo", "First parameter of RCTCoreStellarLikeMemo::release should be an instance of RCTCoreStellarLikeMemo");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, StellarLikeMemo> elem : this.javaObjects.entrySet())
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
    public static byte[] hexStringToByteArray(String hexString)
    {
        int hexStringLength = hexString.length();
        byte[] data = new byte[hexStringLength / 2];
        for (int i = 0; i < hexStringLength; i += 2)
        {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i+1), 16));
        }
        return data;
    }
    static final String HEXES = "0123456789ABCDEF";
    public static String byteArrayToHexString( byte [] data)
    {
        if (data == null)
        {
            return null;
        }
        final StringBuilder hexStringBuilder = new StringBuilder( 2 * data.length );
        for ( final byte b : data )
        {
            hexStringBuilder.append(HEXES.charAt((b & 0xF0) >> 4)).append(HEXES.charAt((b & 0x0F)));
        }
        return hexStringBuilder.toString();
    }

    @ReactMethod
    public void getMemoType(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeMemo currentInstanceObj = this.javaObjects.get(sUid);

            StellarLikeMemoType javaResult = currentInstanceObj.getMemoType();
            WritableNativeMap result = new WritableNativeMap();
            int finalJavaResult = javaResult.ordinal();
            result.putInt("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Get the value of the memo as string. Fail if the memo is not with type MEMO_TEXT */
    @ReactMethod
    public void getMemoText(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeMemo currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getMemoText();
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Get the value of the memo as BigInt. Fail if the memo is not with type MEMO_ID */
    @ReactMethod
    public void getMemoId(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeMemo currentInstanceObj = this.javaObjects.get(sUid);

            BigInt javaResult = currentInstanceObj.getMemoId();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Get the value of the memo as byte array. Fail if the memo is not with type MEMO_HASH */
    @ReactMethod
    public void getMemoHash(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeMemo currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.getMemoHash();
            WritableNativeMap result = new WritableNativeMap();
            String finalJavaResult = byteArrayToHexString(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Get the value of the memo as byte array. Fail if the memo is not with type MEMO_RETURN */
    @ReactMethod
    public void getMemoReturn(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeMemo currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.getMemoReturn();
            WritableNativeMap result = new WritableNativeMap();
            String finalJavaResult = byteArrayToHexString(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Create a string version of the memo, no matter which underlying type it holds.
     * For MEMO_TEXT returns memo value.
     * For MEMO_ID, return a uint64 as string (base 10).
     * For MEMO_HASH, MEMO_RETURN, returns a hex encoded string.
     * For MEMO_NONE, returns an empty string
     */
    @ReactMethod
    public void memoValuetoString(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeMemo currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.memoValuetoString();
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}