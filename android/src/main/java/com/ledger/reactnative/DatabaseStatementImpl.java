package com.ledger.reactnative;

import co.ledger.core.DatabaseBlob;
import co.ledger.core.DatabaseColumn;
import co.ledger.core.DatabaseResultSet;
import co.ledger.core.DatabaseStatement;
import com.facebook.react.bridge.ReactApplicationContext;

public class DatabaseStatementImpl extends DatabaseStatement {
    private ReactApplicationContext reactContext;

    public DatabaseStatementImpl(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;
    }

    public void bindShort(int pos, short value) {
        throw new AssertionError("missing implementation");
    }

    public void bindInt(int pos, int value) {
        throw new AssertionError("missing implementation");
    }

    public void bindLong(int pos, long value) {
        throw new AssertionError("missing implementation");
    }

    public void bindFloat(int pos, float value) {
        throw new AssertionError("missing implementation");
    }

    public void bindDouble(int pos, double value) {
        throw new AssertionError("missing implementation");
    }

    public void bindString(int pos, String value) {
        throw new AssertionError("missing implementation");
    }

    public void bindBlob(int pos, DatabaseBlob value) {
        throw new AssertionError("missing implementation");
    }

    public void bindNull(int pos) {
        throw new AssertionError("missing implementation");
    }

    public DatabaseColumn describeColumn(int colNum) {
        throw new AssertionError("missing implementation");
    }

    public int getColumnCount() {
        throw new AssertionError("missing implementation");
    }

    public DatabaseResultSet execute() {
        throw new AssertionError("missing implementation");
    }

    public void reset() {
        throw new AssertionError("missing implementation");
    }

    public void close() {
        throw new AssertionError("missing implementation");
    }
}
