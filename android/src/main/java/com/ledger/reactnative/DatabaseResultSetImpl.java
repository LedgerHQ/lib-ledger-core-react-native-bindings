package com.ledger.reactnative;

import co.ledger.core.DatabaseError;
import co.ledger.core.DatabaseResultRow;
import co.ledger.core.DatabaseResultSet;
import com.facebook.react.bridge.ReactApplicationContext;

public class DatabaseResultSetImpl extends DatabaseResultSet {
    private ReactApplicationContext reactContext;

    public DatabaseResultSetImpl(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;
    }

    public DatabaseResultRow getRow() {
        throw new AssertionError("missing implementation");
    }

    public int getUpdateCount() {
        throw new AssertionError("missing implementation");
    }

    public boolean hasNext() {
        throw new AssertionError("missing implementation");
    }

    public int available() {
        throw new AssertionError("missing implementation");
    }

    public void next() {
        throw new AssertionError("missing implementation");
    }

    public void close() {
        throw new AssertionError("missing implementation");
    }

    public DatabaseError getError() {
        throw new AssertionError("missing implementation");
    }
}
