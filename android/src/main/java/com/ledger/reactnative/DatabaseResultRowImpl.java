package com.ledger.reactnative;

import co.ledger.core.DatabaseBlob;
import co.ledger.core.DatabaseResultRow;
import com.facebook.react.bridge.ReactApplicationContext;

public class DatabaseResultRowImpl extends DatabaseResultRow {
    private ReactApplicationContext reactContext;

    public DatabaseResultRowImpl(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;
    }

    public boolean isNullAtPos(int pos) {
        throw new AssertionError("missing implementation");
    }

    public String getColumnName(int pos) {
        throw new AssertionError("missing implementation");
    }

    public short getShortByPos(int pos) {
        throw new AssertionError("missing implementation");
    }

    public int getIntByPos(int pos) {
        throw new AssertionError("missing implementation");
    }

    public float getFloatByPos(int pos) {
        throw new AssertionError("missing implementation");
    }

    public double getDoubleByPos(int pos) {
        throw new AssertionError("missing implementation");
    }

    public long getLongByPos(int pos) {
        throw new AssertionError("missing implementation");
    }

    public String getStringByPos(int pos) {
        throw new AssertionError("missing implementation");
    }

    public DatabaseBlob getBlobByPos(int pos) {
        throw new AssertionError("missing implementation");
    }
}
