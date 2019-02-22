package com.ledger.reactnative;

import co.ledger.core.DatabaseError;
import co.ledger.core.DatabaseResultRow;
import co.ledger.core.DatabaseResultSet;

public class DatabaseResultSetImpl extends DatabaseResultSet {
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
