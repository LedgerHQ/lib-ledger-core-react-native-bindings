// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

package com.ledger.reactnative;

import co.ledger.core.Error;
import co.ledger.core.ErrorCode;
import co.ledger.core.ErrorCodeCallback;
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

/**
 *Callback triggered by main completed task,
 *returns optional result of template type T
 */
public class RCTCoreErrorCodeCallback extends ErrorCodeCallback {
    public Promise promise;
    public ReactApplicationContext reactContext;
    public static RCTCoreErrorCodeCallback initWithPromise(Promise promise, ReactApplicationContext reactContext)
    {
        RCTCoreErrorCodeCallback callback = new RCTCoreErrorCodeCallback();
        callback.promise = promise;
        callback.reactContext = reactContext;
        return callback;
    }
    /**
     * Method triggered when main task complete
     * @params result optional of type T, non null if main task failed
     * @params error optional of type Error, non null if main task succeeded
     */
    public void onCallback(ErrorCode result, Error error) {
        try
        {
            if (error != null && error.getMessage().length() > 0)
            {
                this.promise.reject(error.toString(), error.getMessage());
            }

            this.promise.resolve(result);
        }
        catch(Exception e)
        {
            this.promise.reject(e.toString(), e.getMessage());
        }
    }
}
