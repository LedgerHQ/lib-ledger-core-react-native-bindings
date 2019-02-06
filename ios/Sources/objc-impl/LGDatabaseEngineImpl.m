//
//  LGDatabaseEngineImpl.m
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "LGDatabaseEngineImpl.h"

@implementation LGDatabaseEngineImpl

- (nullable id<LGDatabaseConnectionPool>)connect:(nonnull NSString *)databaseName {
    NSAssert(false, @"missing implementation");
    return nil;
}

- (int32_t)getPoolSize {
    NSAssert(false, @"missing implementation");
    return 0;
}

@end
