//
//  LGDatabaseStatementImpl.m
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "LGDatabaseStatementImpl.h"

@implementation LGDatabaseStatementImpl

- (void)bindShort:(int32_t)pos
            value:(int16_t)value {
    NSAssert(false, @"missing implementation");
}

- (void)bindInt:(int32_t)pos
          value:(int32_t)value {
    NSAssert(false, @"missing implementation");
}

- (void)bindLong:(int32_t)pos
           value:(int64_t)value {
    NSAssert(false, @"missing implementation");
}

- (void)bindFloat:(int32_t)pos
            value:(float)value {
    NSAssert(false, @"missing implementation");
}

- (void)bindDouble:(int32_t)pos
             value:(double)value {
    NSAssert(false, @"missing implementation");
}

- (void)bindString:(int32_t)pos
             value:(nonnull NSString *)value {
    NSAssert(false, @"missing implementation");
}

- (void)bindBlob:(int32_t)pos
           value:(nullable id<LGDatabaseBlob>)value {
    NSAssert(false, @"missing implementation");
}

- (void)bindNull:(int32_t)pos {
    NSAssert(false, @"missing implementation");
}

- (nullable id<LGDatabaseColumn>)describeColumn:(int32_t)colNum {
    NSAssert(false, @"missing implementation");
    return nil;
}

- (int32_t)getColumnCount {
    NSAssert(false, @"missing implementation");
    return 0;
}

- (nullable id<LGDatabaseResultSet>)execute {
    NSAssert(false, @"missing implementation");
    return nil;
}

- (void)reset {
    NSAssert(false, @"missing implementation");
}

- (void)close {
    NSAssert(false, @"missing implementation");
}

@end
