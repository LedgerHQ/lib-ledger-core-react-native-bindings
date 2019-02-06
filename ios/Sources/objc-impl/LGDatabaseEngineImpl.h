//
//  LGDatabaseEngineImpl.h
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "LGDatabaseConnectionPool.h"
#import "LGDatabaseEngine.h"

NS_ASSUME_NONNULL_BEGIN

@interface LGDatabaseEngineImpl : NSObject<LGDatabaseEngine>

- (nullable id<LGDatabaseConnectionPool>)connect:(nonnull NSString *)databaseName;

- (int32_t)getPoolSize;

@end

NS_ASSUME_NONNULL_END
