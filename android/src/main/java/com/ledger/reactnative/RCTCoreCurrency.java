// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from currency.djinni

package com.ledger.reactnative;

import co.ledger.core.AlgorandNetworkParameters;
import co.ledger.core.BitcoinLikeNetworkParameters;
import co.ledger.core.CosmosLikeNetworkParameters;
import co.ledger.core.Currency;
import co.ledger.core.CurrencyUnit;
import co.ledger.core.EthereumLikeNetworkParameters;
import co.ledger.core.RippleLikeNetworkParameters;
import co.ledger.core.StellarLikeNetworkParameters;
import co.ledger.core.TezosLikeNetworkParameters;
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

/** Structure of cryptocurrency. */
@ReactModule(name = "RCTCoreCurrency")
public class RCTCoreCurrency extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, Currency> javaObjects;
    private Map<String, Object> implementationsData;
    public Map<String, Currency> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreCurrency(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Currency>();
        this.implementationsData = new HashMap<>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreCurrency";
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
            promise.reject("Failed to release instance of RCTCoreCurrency", "First parameter of RCTCoreCurrency::release should be an instance of RCTCoreCurrency");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, Currency> elem : this.javaObjects.entrySet())
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
    public void init(int walletType, String name, int bip44CoinType, String paymentUriScheme, ReadableArray units, Optional<ReadableMap> bitcoinLikeNetworkParameters, Optional<ReadableMap> cosmosLikeNetworkParameters, Optional<ReadableMap> ethereumLikeNetworkParameters, Optional<ReadableMap> rippleLikeNetworkParameters, Optional<ReadableMap> tezosLikeNetworkParameters, Optional<ReadableMap> stellarLikeNetworkParameters, Optional<ReadableMap> algorandNetworkParameters, Promise promise) {
        WritableNativeMap implementationsData = new WritableNativeMap();
        if (walletType < 0 || WalletType.values().length <= walletType)
        {
            promise.reject("Enum error", "Failed to get enum WalletType");
            return;
        }
        WalletType javaParam_0 = WalletType.values()[walletType];
        ArrayList<CurrencyUnit> javaParam_4 = new ArrayList<CurrencyUnit>();
        WritableNativeArray javaParam_4_data = new WritableNativeArray();

        for (int i = 0; i <  units.size(); i++)
        {
            ReadableMap units_elem = units.getMap(i);
            RCTCoreCurrencyUnit rctParam_units_elem = this.reactContext.getNativeModule(RCTCoreCurrencyUnit.class);
            CurrencyUnit javaParam_4_elem = rctParam_units_elem.getJavaObjects().get(units_elem.getString("uid"));
            javaParam_4_data.pushString(units_elem.getString("uid"));
            javaParam_4.add(javaParam_4_elem);
        }
        implementationsData.putArray("units", javaParam_4_data);

        RCTCoreBitcoinLikeNetworkParameters rctParam_bitcoinLikeNetworkParameters = this.reactContext.getNativeModule(RCTCoreBitcoinLikeNetworkParameters.class);
        BitcoinLikeNetworkParameters javaParam_5 = rctParam_bitcoinLikeNetworkParameters.getJavaObjects().get(bitcoinLikeNetworkParameters.get().getString("uid"));
        implementationsData.putString("bitcoinLikeNetworkParameters", bitcoinLikeNetworkParameters.get().getString("uid"));
        RCTCoreCosmosLikeNetworkParameters rctParam_cosmosLikeNetworkParameters = this.reactContext.getNativeModule(RCTCoreCosmosLikeNetworkParameters.class);
        CosmosLikeNetworkParameters javaParam_6 = rctParam_cosmosLikeNetworkParameters.getJavaObjects().get(cosmosLikeNetworkParameters.get().getString("uid"));
        implementationsData.putString("cosmosLikeNetworkParameters", cosmosLikeNetworkParameters.get().getString("uid"));
        RCTCoreEthereumLikeNetworkParameters rctParam_ethereumLikeNetworkParameters = this.reactContext.getNativeModule(RCTCoreEthereumLikeNetworkParameters.class);
        EthereumLikeNetworkParameters javaParam_7 = rctParam_ethereumLikeNetworkParameters.getJavaObjects().get(ethereumLikeNetworkParameters.get().getString("uid"));
        implementationsData.putString("ethereumLikeNetworkParameters", ethereumLikeNetworkParameters.get().getString("uid"));
        RCTCoreRippleLikeNetworkParameters rctParam_rippleLikeNetworkParameters = this.reactContext.getNativeModule(RCTCoreRippleLikeNetworkParameters.class);
        RippleLikeNetworkParameters javaParam_8 = rctParam_rippleLikeNetworkParameters.getJavaObjects().get(rippleLikeNetworkParameters.get().getString("uid"));
        implementationsData.putString("rippleLikeNetworkParameters", rippleLikeNetworkParameters.get().getString("uid"));
        RCTCoreTezosLikeNetworkParameters rctParam_tezosLikeNetworkParameters = this.reactContext.getNativeModule(RCTCoreTezosLikeNetworkParameters.class);
        TezosLikeNetworkParameters javaParam_9 = rctParam_tezosLikeNetworkParameters.getJavaObjects().get(tezosLikeNetworkParameters.get().getString("uid"));
        implementationsData.putString("tezosLikeNetworkParameters", tezosLikeNetworkParameters.get().getString("uid"));
        RCTCoreStellarLikeNetworkParameters rctParam_stellarLikeNetworkParameters = this.reactContext.getNativeModule(RCTCoreStellarLikeNetworkParameters.class);
        StellarLikeNetworkParameters javaParam_10 = rctParam_stellarLikeNetworkParameters.getJavaObjects().get(stellarLikeNetworkParameters.get().getString("uid"));
        implementationsData.putString("stellarLikeNetworkParameters", stellarLikeNetworkParameters.get().getString("uid"));
        RCTCoreAlgorandNetworkParameters rctParam_algorandNetworkParameters = this.reactContext.getNativeModule(RCTCoreAlgorandNetworkParameters.class);
        AlgorandNetworkParameters javaParam_11 = rctParam_algorandNetworkParameters.getJavaObjects().get(algorandNetworkParameters.get().getString("uid"));
        implementationsData.putString("algorandNetworkParameters", algorandNetworkParameters.get().getString("uid"));
        Currency javaResult = new Currency(javaParam_0, name, bip44CoinType, paymentUriScheme, javaParam_4, javaParam_5, javaParam_6, javaParam_7, javaParam_8, javaParam_9, javaParam_10, javaParam_11);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreCurrency");
        finalResult.putString("uid",uuid);
        this.implementationsData.put(uuid, implementationsData);
        promise.resolve(finalResult);
    }
    public void mapImplementationsData(ReadableMap currentInstance)
    {
        String currentInstanceUid = currentInstance.getString("uid");
        Currency javaImpl = this.javaObjects.get(currentInstanceUid);
        WritableNativeMap implementationsData = new WritableNativeMap();
        ArrayList<CurrencyUnit> field_4 = javaImpl.getUnits();
        WritableNativeArray converted_field_4 = new WritableNativeArray();
        for (CurrencyUnit field_4_elem : field_4)
        {
            String field_4_elem_uuid = UUID.randomUUID().toString();
            RCTCoreCurrencyUnit rctImpl_field_4_elem = this.reactContext.getNativeModule(RCTCoreCurrencyUnit.class);
            rctImpl_field_4_elem.getJavaObjects().put(field_4_elem_uuid, field_4_elem);
            WritableNativeMap converted_field_4_elem = new WritableNativeMap();
            converted_field_4_elem.putString("type","RCTCoreCurrencyUnit");
            converted_field_4_elem.putString("uid",field_4_elem_uuid);
            converted_field_4.pushMap(converted_field_4_elem);
        }
        implementationsData.putArray("units", converted_field_4);
        BitcoinLikeNetworkParameters field_5 = javaImpl.getBitcoinLikeNetworkParameters();
        String field_5_uuid = UUID.randomUUID().toString();
        RCTCoreBitcoinLikeNetworkParameters rctImpl_field_5 = this.reactContext.getNativeModule(RCTCoreBitcoinLikeNetworkParameters.class);
        rctImpl_field_5.getJavaObjects().put(field_5_uuid, field_5);
        WritableNativeMap converted_field_5 = new WritableNativeMap();
        converted_field_5.putString("type","RCTCoreBitcoinLikeNetworkParameters");
        converted_field_5.putString("uid",field_5_uuid);
        implementationsData.putMap("bitcoinLikeNetworkParameters", converted_field_5);
        CosmosLikeNetworkParameters field_6 = javaImpl.getCosmosLikeNetworkParameters();
        String field_6_uuid = UUID.randomUUID().toString();
        RCTCoreCosmosLikeNetworkParameters rctImpl_field_6 = this.reactContext.getNativeModule(RCTCoreCosmosLikeNetworkParameters.class);
        rctImpl_field_6.getJavaObjects().put(field_6_uuid, field_6);
        WritableNativeMap converted_field_6 = new WritableNativeMap();
        converted_field_6.putString("type","RCTCoreCosmosLikeNetworkParameters");
        converted_field_6.putString("uid",field_6_uuid);
        implementationsData.putMap("cosmosLikeNetworkParameters", converted_field_6);
        EthereumLikeNetworkParameters field_7 = javaImpl.getEthereumLikeNetworkParameters();
        String field_7_uuid = UUID.randomUUID().toString();
        RCTCoreEthereumLikeNetworkParameters rctImpl_field_7 = this.reactContext.getNativeModule(RCTCoreEthereumLikeNetworkParameters.class);
        rctImpl_field_7.getJavaObjects().put(field_7_uuid, field_7);
        WritableNativeMap converted_field_7 = new WritableNativeMap();
        converted_field_7.putString("type","RCTCoreEthereumLikeNetworkParameters");
        converted_field_7.putString("uid",field_7_uuid);
        implementationsData.putMap("ethereumLikeNetworkParameters", converted_field_7);
        RippleLikeNetworkParameters field_8 = javaImpl.getRippleLikeNetworkParameters();
        String field_8_uuid = UUID.randomUUID().toString();
        RCTCoreRippleLikeNetworkParameters rctImpl_field_8 = this.reactContext.getNativeModule(RCTCoreRippleLikeNetworkParameters.class);
        rctImpl_field_8.getJavaObjects().put(field_8_uuid, field_8);
        WritableNativeMap converted_field_8 = new WritableNativeMap();
        converted_field_8.putString("type","RCTCoreRippleLikeNetworkParameters");
        converted_field_8.putString("uid",field_8_uuid);
        implementationsData.putMap("rippleLikeNetworkParameters", converted_field_8);
        TezosLikeNetworkParameters field_9 = javaImpl.getTezosLikeNetworkParameters();
        String field_9_uuid = UUID.randomUUID().toString();
        RCTCoreTezosLikeNetworkParameters rctImpl_field_9 = this.reactContext.getNativeModule(RCTCoreTezosLikeNetworkParameters.class);
        rctImpl_field_9.getJavaObjects().put(field_9_uuid, field_9);
        WritableNativeMap converted_field_9 = new WritableNativeMap();
        converted_field_9.putString("type","RCTCoreTezosLikeNetworkParameters");
        converted_field_9.putString("uid",field_9_uuid);
        implementationsData.putMap("tezosLikeNetworkParameters", converted_field_9);
        StellarLikeNetworkParameters field_10 = javaImpl.getStellarLikeNetworkParameters();
        String field_10_uuid = UUID.randomUUID().toString();
        RCTCoreStellarLikeNetworkParameters rctImpl_field_10 = this.reactContext.getNativeModule(RCTCoreStellarLikeNetworkParameters.class);
        rctImpl_field_10.getJavaObjects().put(field_10_uuid, field_10);
        WritableNativeMap converted_field_10 = new WritableNativeMap();
        converted_field_10.putString("type","RCTCoreStellarLikeNetworkParameters");
        converted_field_10.putString("uid",field_10_uuid);
        implementationsData.putMap("stellarLikeNetworkParameters", converted_field_10);
        AlgorandNetworkParameters field_11 = javaImpl.getAlgorandNetworkParameters();
        String field_11_uuid = UUID.randomUUID().toString();
        RCTCoreAlgorandNetworkParameters rctImpl_field_11 = this.reactContext.getNativeModule(RCTCoreAlgorandNetworkParameters.class);
        rctImpl_field_11.getJavaObjects().put(field_11_uuid, field_11);
        WritableNativeMap converted_field_11 = new WritableNativeMap();
        converted_field_11.putString("type","RCTCoreAlgorandNetworkParameters");
        converted_field_11.putString("uid",field_11_uuid);
        implementationsData.putMap("algorandNetworkParameters", converted_field_11);
        this.implementationsData.put(currentInstanceUid, implementationsData);
    }
    @ReactMethod
    public void getWalletType(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            WalletType result = javaObj.getWalletType();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putInt("value", result.ordinal());
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getWalletType", "First parameter of RCTCoreCurrency::getWalletType should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getName(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            String result = javaObj.getName();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getName", "First parameter of RCTCoreCurrency::getName should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getBip44CoinType(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            int result = javaObj.getBip44CoinType();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putInt("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getBip44CoinType", "First parameter of RCTCoreCurrency::getBip44CoinType should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getPaymentUriScheme(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            String result = javaObj.getPaymentUriScheme();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putString("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getPaymentUriScheme", "First parameter of RCTCoreCurrency::getPaymentUriScheme should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getUnits(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.containsKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = (ReadableNativeMap)this.implementationsData.get(uid);
            ReadableArray resultTmp = data.getArray("units");
            WritableNativeArray result = new WritableNativeArray();
            for (int i = 0; i < resultTmp.size(); i++)
            {
                WritableNativeMap result_elem = new WritableNativeMap();
                result_elem.merge(resultTmp.getMap(i));
                result.pushMap(result_elem);
            }
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getUnits", "First parameter of RCTCoreCurrency::getUnits should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getBitcoinLikeNetworkParameters(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.containsKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = (ReadableNativeMap)this.implementationsData.get(uid);
            WritableNativeMap result = new WritableNativeMap();
            result.merge(data.getMap("bitcoinLikeNetworkParameters"));
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getBitcoinLikeNetworkParameters", "First parameter of RCTCoreCurrency::getBitcoinLikeNetworkParameters should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getCosmosLikeNetworkParameters(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.containsKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = (ReadableNativeMap)this.implementationsData.get(uid);
            WritableNativeMap result = new WritableNativeMap();
            result.merge(data.getMap("cosmosLikeNetworkParameters"));
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getCosmosLikeNetworkParameters", "First parameter of RCTCoreCurrency::getCosmosLikeNetworkParameters should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getEthereumLikeNetworkParameters(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.containsKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = (ReadableNativeMap)this.implementationsData.get(uid);
            WritableNativeMap result = new WritableNativeMap();
            result.merge(data.getMap("ethereumLikeNetworkParameters"));
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getEthereumLikeNetworkParameters", "First parameter of RCTCoreCurrency::getEthereumLikeNetworkParameters should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getRippleLikeNetworkParameters(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.containsKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = (ReadableNativeMap)this.implementationsData.get(uid);
            WritableNativeMap result = new WritableNativeMap();
            result.merge(data.getMap("rippleLikeNetworkParameters"));
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getRippleLikeNetworkParameters", "First parameter of RCTCoreCurrency::getRippleLikeNetworkParameters should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getTezosLikeNetworkParameters(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.containsKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = (ReadableNativeMap)this.implementationsData.get(uid);
            WritableNativeMap result = new WritableNativeMap();
            result.merge(data.getMap("tezosLikeNetworkParameters"));
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getTezosLikeNetworkParameters", "First parameter of RCTCoreCurrency::getTezosLikeNetworkParameters should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getStellarLikeNetworkParameters(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.containsKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = (ReadableNativeMap)this.implementationsData.get(uid);
            WritableNativeMap result = new WritableNativeMap();
            result.merge(data.getMap("stellarLikeNetworkParameters"));
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getStellarLikeNetworkParameters", "First parameter of RCTCoreCurrency::getStellarLikeNetworkParameters should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getAlgorandNetworkParameters(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.containsKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = (ReadableNativeMap)this.implementationsData.get(uid);
            WritableNativeMap result = new WritableNativeMap();
            result.merge(data.getMap("algorandNetworkParameters"));
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getAlgorandNetworkParameters", "First parameter of RCTCoreCurrency::getAlgorandNetworkParameters should be an instance of RCTCoreCurrency");
        }
    }

}
