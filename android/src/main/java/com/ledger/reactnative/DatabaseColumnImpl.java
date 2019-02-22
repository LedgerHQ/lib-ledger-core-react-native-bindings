package com.ledger.reactnative;

import co.ledger.core.DatabaseColumn;
import co.ledger.core.DatabaseValueType;
import com.facebook.react.bridge.ReactApplicationContext;

public class DatabaseColumnImpl extends DatabaseColumn {
    private ReactApplicationContext reactContext;

    public DatabaseColumnImpl(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;
    }

    public DatabaseValueType getType() {
        throw new AssertionError("missing implementation");
    }

    public String getName() {
        throw new AssertionError("missing implementation");
    }
}
