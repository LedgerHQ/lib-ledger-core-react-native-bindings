package com.ledger.reactnative;

import co.ledger.core.DatabaseColumn;
import co.ledger.core.DatabaseValueType;

public class DatabaseColumnImpl extends DatabaseColumn {
    public DatabaseValueType getType() {
        throw new AssertionError("missing implementation");
    }

    public String getName() {
        throw new AssertionError("missing implementation");
    }
}
