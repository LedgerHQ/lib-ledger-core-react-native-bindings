//
//  LGDatabaseConnectionImpl.h
//  RNLibLedgerCore
//
//  Created by dsabadie on 06/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "LGDatabaseConnection.h"
#import "LGDatabaseStatement.h"

NS_ASSUME_NONNULL_BEGIN

@interface LGDatabaseConnectionImpl : NSObject<LGDatabaseConnection>

- (nullable id<LGDatabaseStatement>)prepareStatement:(nonnull NSString *)query
                                          repeatable:(BOOL)repeatable;

- (void)begin;

- (void)rollback;

- (void)commit;

- (void)close;

- (nullable id<LGDatabaseBlob>)newBlob;

@end

NS_ASSUME_NONNULL_END
