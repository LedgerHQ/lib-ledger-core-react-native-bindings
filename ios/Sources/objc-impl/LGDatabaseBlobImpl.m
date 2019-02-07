//
//  LGDatabaseBlobImpl.m
//  RNLibLedgerCore
//
//  Created by dsabadie on 06/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "LGDatabaseBlobImpl.h"

@implementation LGDatabaseBlobImpl

@synthesize resolve = _resolve;
@synthesize reject = _reject;

- (nonnull NSData *)read:(int64_t)offset
                  length:(int64_t)length {
    NSAssert(false, @"missing implementation");
    return nil; // nil, nonnull… :goodenough:
}

- (int64_t)write:(int64_t)offset
            data:(nonnull NSData *)data {
    NSAssert(false, @"missing implementation");
    return 0;
}

- (int64_t)append:(nonnull NSData *)data {
    NSAssert(false, @"missing implementation");
    return 0;
}

- (int64_t)trim:(int64_t)newLen {
    NSAssert(false, @"missing implementation");
    return 0;
}

- (int64_t)size {
    NSAssert(false, @"missing implementation");
    return 0;
}

@end
