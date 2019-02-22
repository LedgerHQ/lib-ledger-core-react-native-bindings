package com.ledger.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;
import co.ledger.core.DatabaseConnectionPool;
import co.ledger.core.DatabaseEngine;

public class DatabaseEngineImpl extends DatabaseEngine {
    private ReactApplicationContext reactContext;

    public DatabaseEngineImpl(ReactApplicationContext reactcontext) {
        this.reactContext = reactContext;
    }

    public DatabaseConnectionPool connect(String databaseName) {
        throw new AssertionError("missing implementation");
    }

    public int getPoolSize() {
        throw new AssertionError("missing implementation");
    }
}
