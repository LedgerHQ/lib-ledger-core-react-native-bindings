//
//  LGDatabaseResultSetImpl.m
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "LGDatabaseResultSetImpl.h"

@implementation LGDatabaseResultSetImpl

- (nullable id<LGDatabaseResultRow>)getRow {
    NSAssert(false, @"missing implementation");
    return nil;
}

- (int32_t)getUpdateCount {
    NSAssert(false, @"missing implementation");
    return 0;
}

- (int32_t)getRowNumber {
    NSAssert(false, @"missing implementation");
    return 0;
}

- (int32_t)available {
    NSAssert(false, @"missing implementation");
    return 0;
}

- (BOOL)hasNext {
    NSAssert(false, @"missing implementation");
    return false;
}

- (nullable id<LGDatabaseResultSet>)next {
    NSAssert(false, @"missing implementation");
    return nil;
}

- (void)close {
    NSAssert(false, @"missing implementation");
}

- (nullable id<LGDatabaseError>)getError {
    NSAssert(false, @"missing implementation");
    return nil;
}

@end
