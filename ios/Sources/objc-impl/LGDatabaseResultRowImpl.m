//
//  LGDatabaseResultRowImpl.m
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "LGDatabaseResultRowImpl.h"

@implementation LGDatabaseResultRowImpl

- (BOOL)isNullAtPos:(int32_t)pos {
    NSAssert(false, @"missing implementation");
    return false;
}

- (nonnull NSString *)getColumnName:(int32_t)pos {
    NSAssert(false, @"missing implementation");
    return nil;
}

- (int16_t)getShortByPos:(int32_t)pos {
    NSAssert(false, @"missing implementation");
    return 0;
}

- (int32_t)getIntByPos:(int32_t)pos {
    NSAssert(false, @"missing implementation");
    return 0;
}

- (float)getFloatByPos:(int32_t)pos {
    NSAssert(false, @"missing implementation");
    return 0.0;
}

- (double)getDoubleByPos:(int32_t)pos {
    NSAssert(false, @"missing implementation");
    return 0.0;
}

- (int64_t)getLongByPos:(int32_t)pos {
    NSAssert(false, @"missing implementation");
    return 0;
}

- (nonnull NSString *)getStringByPos:(int32_t)pos {
    NSAssert(false, @"missing implementation");
    return nil;
}

- (nullable id<LGDatabaseBlob>)getBlobByPos:(int32_t)pos {
    NSAssert(false, @"missing implementation");
    return nil;
}

@end
