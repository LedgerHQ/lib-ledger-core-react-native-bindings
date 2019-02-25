package com.ledger.reactnative;

import co.ledger.core.DatabaseBlob;
import co.ledger.core.DatabaseConnection;
import co.ledger.core.DatabaseStatement;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

public class DatabaseConnectionImpl extends DatabaseConnection {
    private ReactApplicationContext reactContext;
    private Promise promise;

    public DatabaseConnectionImpl(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;
    }

    public void setPromise(Promise _promise) {
        this.promise = _promise;
    }

    public DatabaseStatement prepareStatement(String query, boolean repeatable) {
        throw new AssertionError("missing implementation");
    }

    public void begin() {
        throw new AssertionError("missing implementation");
    }

    public void rollback() {
        throw new AssertionError("missing implementation");
    }

    public void commit() {
        throw new AssertionError("missing implementation");
    }

    public void close() {
        throw new AssertionError("missing implementation");
    }

    public DatabaseBlob newBlob() {
        throw new AssertionError("missing implementation");
    }
}
