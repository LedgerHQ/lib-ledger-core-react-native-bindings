//
//  LGDatabaseConnectionPoolImpl.h
//  RNLibLedgerCore
//
//  Created by dsabadie on 06/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "LGDatabaseConnectionPool.h"

NS_ASSUME_NONNULL_BEGIN

@interface LGDatabaseConnectionPoolImpl : NSObject<LGDatabaseConnectionPool>

- (nullable id<LGDatabaseConnection>)getConnection;

@end

NS_ASSUME_NONNULL_END
