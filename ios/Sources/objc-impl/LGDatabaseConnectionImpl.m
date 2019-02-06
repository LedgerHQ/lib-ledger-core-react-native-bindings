//
//  LGDatabaseConnectionImpl.m
//  RNLibLedgerCore
//
//  Created by dsabadie on 06/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "LGDatabaseConnectionImpl.h"

@implementation LGDatabaseConnectionImpl

- (nullable id<LGDatabaseStatement>)prepareStatement:(nonnull NSString *)query
                                          repeatable:(BOOL)repeatable {
    NSAssert(false, @"missing implementation");
    return nil;
}

- (void)begin {
    NSAssert(false, @"missing implementation");
}

- (void)rollback {
    NSAssert(false, @"missing implementation");
}

- (void)commit {
    NSAssert(false, @"missing implementation");
}

- (void)close {
    NSAssert(false, @"missing implementation");
}

- (nullable id<LGDatabaseBlob>)newBlob {
    NSAssert(false, @"missing implementation");
    return nil;
}

@end
