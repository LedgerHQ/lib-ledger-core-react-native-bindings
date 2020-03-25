// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from stellar_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Address;
import co.ledger.core.Amount;
import co.ledger.core.BigInt;
import co.ledger.core.StellarLikeTransaction;
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

@ReactModule(name = "RCTCoreStellarLikeTransaction")
public class RCTCoreStellarLikeTransaction extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, StellarLikeTransaction> javaObjects;
    public Map<String, StellarLikeTransaction> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreStellarLikeTransaction(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, StellarLikeTransaction>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreStellarLikeTransaction";
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
            promise.reject("Failed to release instance of RCTCoreStellarLikeTransaction", "First parameter of RCTCoreStellarLikeTransaction::release should be an instance of RCTCoreStellarLikeTransaction");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, StellarLikeTransaction> elem : this.javaObjects.entrySet())
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
    public void toRawTransaction(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeTransaction currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.toRawTransaction();
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
    /** Returns the payload which should be signed by the user in order to send the transaction. */
    @ReactMethod
    public void toSignatureBase(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeTransaction currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.toSignatureBase();
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
    /** Add a new signature to the transaction envelope */
    @ReactMethod
    public void putSignature(ReadableMap currentInstance, String signature, ReadableMap address, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeTransaction currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_0 = hexStringToByteArray(signature);

            RCTCoreAddress rctParam_address = this.reactContext.getNativeModule(RCTCoreAddress.class);
            Address javaParam_1 = rctParam_address.getJavaObjects().get(address.getString("uid"));
            currentInstanceObj.putSignature(javaParam_0, javaParam_1);
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Returns the author of the transaction */
    @ReactMethod
    public void getSourceAccount(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeTransaction currentInstanceObj = this.javaObjects.get(sUid);

            Address javaResult = currentInstanceObj.getSourceAccount();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreAddress rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAddress.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreAddress");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Returns the sequence of the source account used for this transaction */
    @ReactMethod
    public void getSourceAccountSequence(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeTransaction currentInstanceObj = this.javaObjects.get(sUid);

            BigInt javaResult = currentInstanceObj.getSourceAccountSequence();

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
    /** Returns the fee paid for this transaction to be validated */
    @ReactMethod
    public void getFee(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            StellarLikeTransaction currentInstanceObj = this.javaObjects.get(sUid);

            Amount javaResult = currentInstanceObj.getFee();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreAmount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAmount.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreAmount");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
