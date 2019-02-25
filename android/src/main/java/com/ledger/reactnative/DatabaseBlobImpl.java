package com.ledger.reactnative;

import co.ledger.core.DatabaseBlob;
import com.facebook.react.bridge.ReactApplicationContext;

public class DatabaseBlobImpl extends DatabaseBlob {
    private ReactApplicationContext reactContext;

    public DatabaseBlobImpl(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;
    }

    public byte[] read(long offset, long length) {
        throw new AssertionError("missing implementation");
    }

    public long write(long offset, byte[] data) {
        throw new AssertionError("missing implementation");
    }

    public long append(byte[] data) {
        throw new AssertionError("missing implementation");
    }

    public long trim(long newLen) {
        throw new AssertionError("missing implementation");
    }

    public long size() {
        throw new AssertionError("missing implementation");
    }
}
