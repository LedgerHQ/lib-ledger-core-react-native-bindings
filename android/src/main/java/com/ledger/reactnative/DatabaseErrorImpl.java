package com.ledger.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;
import co.ledger.core.DatabaseError;

public class DatabaseErrorImpl extends DatabaseError {
    private ReactApplicationContext reactContext;

    public DatabaseErrorImpl(ReactApplicationContext reactcontext) {
        this.reactContext = reactContext;
    }

    public String getMessage() {
        throw new AssertionError("missing implementation");
    }
}
