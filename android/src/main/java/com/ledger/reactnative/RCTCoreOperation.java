// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Amount;
import co.ledger.core.BitcoinLikeOperation;
import co.ledger.core.Currency;
import co.ledger.core.EthereumLikeOperation;
import co.ledger.core.Operation;
import co.ledger.core.OperationType;
import co.ledger.core.Preferences;
import co.ledger.core.RippleLikeOperation;
import co.ledger.core.StellarLikeOperation;
import co.ledger.core.TezosLikeOperation;
import co.ledger.core.TrustIndicator;
import co.ledger.core.WalletType;
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

/** Class representing an operation. */
@ReactModule(name = "RCTCoreOperation")
public class RCTCoreOperation extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, Operation> javaObjects;
    public Map<String, Operation> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreOperation(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Operation>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreOperation";
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
            promise.reject("Failed to release instance of RCTCoreOperation", "First parameter of RCTCoreOperation::release should be an instance of RCTCoreOperation");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, Operation> elem : this.javaObjects.entrySet())
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

    /**
     * Get id's operation.
     * @return string
     */
    @ReactMethod
    public void getUid(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getUid();
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
     * Get account's index in user's wallet.
     * @return 32-bit integer
     */
    @ReactMethod
    public void getAccountIndex(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getAccountIndex();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get type of operation.
     * @return OperationType object (for more details refer to OperationType)
     */
    @ReactMethod
    public void getOperationType(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            OperationType javaResult = currentInstanceObj.getOperationType();
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
    /**
     * Return date on which operation was issued.
     * @return date object
     */
    @ReactMethod
    public void getDate(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            Date javaResult = currentInstanceObj.getDate();
            WritableNativeMap result = new WritableNativeMap();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String finalJavaResult = dateFormat.format(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get senders of operation.
     * @return List of string, list of all senders
     */
    @ReactMethod
    public void getSenders(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            ArrayList<String> javaResult = currentInstanceObj.getSenders();
            WritableNativeMap result = new WritableNativeMap();
            WritableNativeArray javaResult_list = new WritableNativeArray();
            for(String javaResult_elem : javaResult)
            {
                javaResult_list.pushString(javaResult_elem);
            }
            result.putArray("value", javaResult_list);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get recipients of operation.
     * @return List of string, list of all recipients
     */
    @ReactMethod
    public void getRecipients(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            ArrayList<String> javaResult = currentInstanceObj.getRecipients();
            WritableNativeMap result = new WritableNativeMap();
            WritableNativeArray javaResult_list = new WritableNativeArray();
            for(String javaResult_elem : javaResult)
            {
                javaResult_list.pushString(javaResult_elem);
            }
            result.putArray("value", javaResult_list);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get amount of operation.
     * @return Amount object
     */
    @ReactMethod
    public void getAmount(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            Amount javaResult = currentInstanceObj.getAmount();

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
    /**
     * Get fees of operation.
     * @return Optional Amount object
     */
    @ReactMethod
    public void getFees(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            Amount javaResult = currentInstanceObj.getFees();

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
    /**
     * Get preferences of operation.
     * @return Prefences object
     */
    @ReactMethod
    public void getPreferences(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            Preferences javaResult = currentInstanceObj.getPreferences();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCorePreferences rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferences.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferences");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get trust indicator of operation.
     * @return TrustIndicator object
     */
    @ReactMethod
    public void getTrust(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            TrustIndicator javaResult = currentInstanceObj.getTrust();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreTrustIndicator rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreTrustIndicator.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreTrustIndicator");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get block height on which operation was included.
     * @return Optional 64-bit integer, height of block in which operation was validated
     */
    @ReactMethod
    public void getBlockHeight(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            Long javaResult = currentInstanceObj.getBlockHeight();
            WritableNativeMap result = new WritableNativeMap();
            if (javaResult == null)
            {
                promise.resolve(javaResult);
                return;
            }
            result.putDouble("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Convert operation as Bitcoin operation.
     * @return BitcoinLikeOperation object
     */
    @ReactMethod
    public void asBitcoinLikeOperation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeOperation javaResult = currentInstanceObj.asBitcoinLikeOperation();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeOperation rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeOperation.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeOperation");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Convert operation as Ethereum operation.
     * @return EthereumLikeOperation object
     */
    @ReactMethod
    public void asEthereumLikeOperation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            EthereumLikeOperation javaResult = currentInstanceObj.asEthereumLikeOperation();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreEthereumLikeOperation rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreEthereumLikeOperation.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreEthereumLikeOperation");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Convert operation as Ripple operation
     *@return RippleLikeOperation object
     */
    @ReactMethod
    public void asRippleLikeOperation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            RippleLikeOperation javaResult = currentInstanceObj.asRippleLikeOperation();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreRippleLikeOperation rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreRippleLikeOperation.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreRippleLikeOperation");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Convert operation as Tezos operation
     *@return TezosLikeOperation object
     */
    @ReactMethod
    public void asTezosLikeOperation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            TezosLikeOperation javaResult = currentInstanceObj.asTezosLikeOperation();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreTezosLikeOperation rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreTezosLikeOperation.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreTezosLikeOperation");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Same as isInstanceOfBitcoinLikeOperation for bitcoin.
     * Convert operation as Ethereum operation.
     * @return EthereumLikeOperation object
     */
    @ReactMethod
    public void asStellarLikeOperation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            StellarLikeOperation javaResult = currentInstanceObj.asStellarLikeOperation();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreStellarLikeOperation rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreStellarLikeOperation.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreStellarLikeOperation");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Is this an instance of a Bitcoin-like operation? */
    @ReactMethod
    public void isInstanceOfBitcoinLikeOperation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isInstanceOfBitcoinLikeOperation();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Same as isInstanceOfEthereumLikeOperation for ethereum. */
    @ReactMethod
    public void isInstanceOfEthereumLikeOperation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isInstanceOfEthereumLikeOperation();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Same as isInstanceOfRippleLikeOperation for ripple. */
    @ReactMethod
    public void isInstanceOfRippleLikeOperation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isInstanceOfRippleLikeOperation();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Same as isInstanceOfTezosLikeOperation for tezos. */
    @ReactMethod
    public void isInstanceOfTezosLikeOperation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isInstanceOfTezosLikeOperation();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Same as isInstanceOfBitcoinLikeOperation for ripple. */
    @ReactMethod
    public void isInstanceOfStellarLikeOperation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isInstanceOfStellarLikeOperation();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Tells if the operation is complete.
     * @return boolean
     */
    @ReactMethod
    public void isComplete(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isComplete();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get type of wallet from which operation was issued.
     * @return WalletType object
     */
    @ReactMethod
    public void getWalletType(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            WalletType javaResult = currentInstanceObj.getWalletType();
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
    /** Get the currency this operation is about. */
    @ReactMethod
    public void getCurrency(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Operation currentInstanceObj = this.javaObjects.get(sUid);

            Currency javaResult = currentInstanceObj.getCurrency();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreCurrency rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreCurrency.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreCurrency");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
