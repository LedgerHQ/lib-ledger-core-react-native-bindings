package com.ledger.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;
import co.ledger.core.DatabaseConnection;
import co.ledger.core.DatabaseConnectionPool;

public class DatabaseConnectionPoolImpl extends DatabaseConnectionPool {
    private ReactApplicationContext reactContext;

    public DatabaseConnectionPoolImpl(ReactApplicationContext reactcontext) {
        this.reactContext = reactContext;
    }

    public DatabaseConnection getConnection() {
        throw new AssertionError("missing implementation");
    }
}
