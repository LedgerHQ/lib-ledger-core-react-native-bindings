// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Amount;
import co.ledger.core.BitcoinLikePickingStrategy;
import co.ledger.core.BitcoinLikeScript;
import co.ledger.core.BitcoinLikeTransaction;
import co.ledger.core.BitcoinLikeTransactionBuilder;
import co.ledger.core.BitcoinLikeTransactionCallback;
import co.ledger.core.Currency;
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

@ReactModule(name = "RCTCoreBitcoinLikeTransactionBuilder")
public class RCTCoreBitcoinLikeTransactionBuilder extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeTransactionBuilder> javaObjects;
    public Map<String, BitcoinLikeTransactionBuilder> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreBitcoinLikeTransactionBuilder(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeTransactionBuilder>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeTransactionBuilder";
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
            promise.reject("Failed to release instance of RCTCoreBitcoinLikeTransactionBuilder", "First parameter of RCTCoreBitcoinLikeTransactionBuilder::release should be an instance of RCTCoreBitcoinLikeTransactionBuilder");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, BitcoinLikeTransactionBuilder> elem : this.javaObjects.entrySet())
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

    /**
     * Add the given input to the final transaction.
     * @param transactionhash The hash of the transaction in where the UTXO can be located.
     * @params index Index of the UTXO in the previous transaction
     * @params sequence Sequence number to add at the end of the input serialization. This can be used for RBF transaction
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void addInput(ReadableMap currentInstance, String transactionHash, int index, int sequence, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.addInput(transactionHash, index, sequence);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Add the given output to the final transaction.
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void addOutput(ReadableMap currentInstance, ReadableMap amount, ReadableMap script, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            RCTCoreBitcoinLikeScript rctParam_script = this.reactContext.getNativeModule(RCTCoreBitcoinLikeScript.class);
            BitcoinLikeScript javaParam_1 = rctParam_script.getJavaObjects().get(script.getString("uid"));
            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.addOutput(javaParam_0, javaParam_1);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * If needed the transaction will send its change to the given path. It is possible to add multiple change path.
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void addChangePath(ReadableMap currentInstance, String path, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.addChangePath(path);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Exclude UTXO from the coin selection (alias UTXO picking). You can call this method multiple times to exclude multiple
     * UTXO.
     * @param transactionHash The hash of the transaction in which this UTXO can be found.
     * @param outputIndex The position of the output in the previous transaction,
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void excludeUtxo(ReadableMap currentInstance, String transactionHash, int outputIndex, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.excludeUtxo(transactionHash, outputIndex);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set the the number of change addresses in the transaction builder.
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void setNumberOfChangeAddresses(ReadableMap currentInstance, int count, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.setNumberOfChangeAddresses(count);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set the maximum amount per change output. By default there is no max amount.
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void setMaxAmountOnChange(ReadableMap currentInstance, ReadableMap amount, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.setMaxAmountOnChange(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set the minimum amount per change output. By default this value is the dust value of the currency.
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void setMinAmountOnChange(ReadableMap currentInstance, ReadableMap amount, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.setMinAmountOnChange(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set the UTXO picking strategy (see [[BitcoinLikePickingStrategy]]).
     * @param strategy The strategy to adopt in order to select which input to use in the transaction.
     * @param sequence The sequence value serialized at the end of the raw transaction. If you don't know what to put here
     * just use 0xFFFFFF
     * @param maxUtxo The maximum number of utxos to pick (It applies only for HIGHEST_FIRST_LIMIT_UTXO and LIMIT_UTXO)
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void pickInputs(ReadableMap currentInstance, int strategy, int sequence, Integer maxUtxo, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            if (strategy < 0 || BitcoinLikePickingStrategy.values().length <= strategy)
            {
                promise.reject("Enum error", "Failed to get enum BitcoinLikePickingStrategy");
                return;
            }
            BitcoinLikePickingStrategy javaParam_0 = BitcoinLikePickingStrategy.values()[strategy];
            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.pickInputs(javaParam_0, sequence, maxUtxo);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Send funds to the given address. This method can be called multiple times to send to multiple addresses.
     * @param amount The value to send
     * @param address Address of the recipient
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void sendToAddress(ReadableMap currentInstance, ReadableMap amount, String address, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.sendToAddress(javaParam_0, address);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Send all available funds to the given address.
     * @param address Address of the recipient
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void wipeToAddress(ReadableMap currentInstance, String address, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.wipeToAddress(address);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set the amount of fees per byte (of the raw transaction).
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void setFeesPerByte(ReadableMap currentInstance, ReadableMap fees, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_fees = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_fees.getJavaObjects().get(fees.getString("uid"));
            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.setFeesPerByte(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Build a transaction from the given builder parameters. */
    @ReactMethod
    public void build(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBitcoinLikeTransactionCallback javaParam_0 = RCTCoreBitcoinLikeTransactionCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.build(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Creates a clone of this builder.
     * @return A copy of the current builder instance.
     */
    @ReactMethod
    public void clone(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.clone();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Reset the current instance to its initial state. */
    @ReactMethod
    public void reset(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.reset();
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Parsing unsigned transaction.
     * parsing a tx might change depending on block height we are on (if an update is effective starting from a given hight)
     */
    @ReactMethod
    public void parseRawUnsignedTransaction(ReadableMap currency, String rawTransaction, int currentBlockHeight, Promise promise) {
        try
        {
            RCTCoreCurrency rctParam_currency = this.reactContext.getNativeModule(RCTCoreCurrency.class);
            Currency javaParam_0 = rctParam_currency.getJavaObjects().get(currency.getString("uid"));
            byte [] javaParam_1 = hexStringToByteArray(rawTransaction);

            BitcoinLikeTransaction javaResult = BitcoinLikeTransactionBuilder.parseRawUnsignedTransaction(javaParam_0, javaParam_1, currentBlockHeight);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransaction rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransaction.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransaction");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
