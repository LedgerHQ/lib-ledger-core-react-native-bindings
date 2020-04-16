// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Amount;
import co.ledger.core.OperationType;
import co.ledger.core.QueryFilter;
import co.ledger.core.TrustLevel;
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

/**TODO */
@ReactModule(name = "RCTCoreQueryFilter")
public class RCTCoreQueryFilter extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, QueryFilter> javaObjects;
    public Map<String, QueryFilter> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreQueryFilter(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, QueryFilter>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreQueryFilter";
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
            promise.reject("Failed to release instance of RCTCoreQueryFilter", "First parameter of RCTCoreQueryFilter::release should be an instance of RCTCoreQueryFilter");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, QueryFilter> elem : this.javaObjects.entrySet())
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
    public void accountEq(String accountUid, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.accountEq(accountUid);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void accountNeq(String accountUid, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.accountNeq(accountUid);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void dateLte(Date time, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.dateLte(time);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void dateLt(Date time, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.dateLt(time);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void dateGt(Date time, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.dateGt(time);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void dateGte(Date time, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.dateGte(time);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void dateEq(Date time, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.dateEq(time);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void dateNeq(Date time, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.dateNeq(time);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void containsRecipient(String recipientAddress, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.containsRecipient(recipientAddress);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void containsSender(String senderAddress, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.containsSender(senderAddress);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void currencyEq(String currencyName, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.currencyEq(currencyName);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void operationUidEq(String operationUid, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.operationUidEq(operationUid);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void operationUidNeq(String operationUid, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.operationUidNeq(operationUid);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void trustEq(int trust, Promise promise) {
        try
        {
            if (trust < 0 || TrustLevel.values().length <= trust)
            {
                promise.reject("Enum error", "Failed to get enum TrustLevel");
                return;
            }
            TrustLevel javaParam_0 = TrustLevel.values()[trust];
            QueryFilter javaResult = QueryFilter.trustEq(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void trustNeq(int trust, Promise promise) {
        try
        {
            if (trust < 0 || TrustLevel.values().length <= trust)
            {
                promise.reject("Enum error", "Failed to get enum TrustLevel");
                return;
            }
            TrustLevel javaParam_0 = TrustLevel.values()[trust];
            QueryFilter javaResult = QueryFilter.trustNeq(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void feesEq(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.feesEq(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void feesNeq(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.feesNeq(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void feesGte(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.feesGte(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void feesGt(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.feesGt(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void feesLte(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.feesLte(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void feesLt(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.feesLt(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void amountEq(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.amountEq(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void amountNeq(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.amountNeq(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void amountGte(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.amountGte(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void amountGt(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.amountGt(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void amountLte(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.amountLte(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void amountLt(ReadableMap amount, Promise promise) {
        try
        {
            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            QueryFilter javaResult = QueryFilter.amountLt(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void blockHeightEq(int blockHeight, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.blockHeightEq(blockHeight);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void blockHeightNeq(int blockHeight, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.blockHeightNeq(blockHeight);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void blockHeightGte(int blockHeight, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.blockHeightGte(blockHeight);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void blockHeightGt(int blockHeight, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.blockHeightGt(blockHeight);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void blockHeightLte(int blockHeight, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.blockHeightLte(blockHeight);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void blockHeightLt(int blockHeight, Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.blockHeightLt(blockHeight);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void blockHeightIsNull(Promise promise) {
        try
        {
            QueryFilter javaResult = QueryFilter.blockHeightIsNull();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void operationTypeEq(int operationType, Promise promise) {
        try
        {
            if (operationType < 0 || OperationType.values().length <= operationType)
            {
                promise.reject("Enum error", "Failed to get enum OperationType");
                return;
            }
            OperationType javaParam_0 = OperationType.values()[operationType];
            QueryFilter javaResult = QueryFilter.operationTypeEq(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void operationTypeNeq(int operationType, Promise promise) {
        try
        {
            if (operationType < 0 || OperationType.values().length <= operationType)
            {
                promise.reject("Enum error", "Failed to get enum OperationType");
                return;
            }
            OperationType javaParam_0 = OperationType.values()[operationType];
            QueryFilter javaResult = QueryFilter.operationTypeNeq(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void opAnd(ReadableMap currentInstance, ReadableMap filter, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            QueryFilter currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreQueryFilter rctParam_filter = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            QueryFilter javaParam_0 = rctParam_filter.getJavaObjects().get(filter.getString("uid"));
            QueryFilter javaResult = currentInstanceObj.opAnd(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void opOr(ReadableMap currentInstance, ReadableMap filter, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            QueryFilter currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreQueryFilter rctParam_filter = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            QueryFilter javaParam_0 = rctParam_filter.getJavaObjects().get(filter.getString("uid"));
            QueryFilter javaResult = currentInstanceObj.opOr(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void opAndNot(ReadableMap currentInstance, ReadableMap filter, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            QueryFilter currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreQueryFilter rctParam_filter = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            QueryFilter javaParam_0 = rctParam_filter.getJavaObjects().get(filter.getString("uid"));
            QueryFilter javaResult = currentInstanceObj.opAndNot(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void opOrNot(ReadableMap currentInstance, ReadableMap filter, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            QueryFilter currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreQueryFilter rctParam_filter = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            QueryFilter javaParam_0 = rctParam_filter.getJavaObjects().get(filter.getString("uid"));
            QueryFilter javaResult = currentInstanceObj.opOrNot(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreQueryFilter rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreQueryFilter.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreQueryFilter");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
