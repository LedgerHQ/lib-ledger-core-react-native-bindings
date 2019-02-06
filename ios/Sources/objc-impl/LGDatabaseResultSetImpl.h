//
//  LGDatabaseResultSetImpl.h
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "LGDatabaseResultSet.h"

NS_ASSUME_NONNULL_BEGIN

@interface LGDatabaseResultSetImpl : NSObject<LGDatabaseResultSet>

- (nullable id<LGDatabaseResultRow>)getRow;

- (int32_t)getUpdateCount;

- (int32_t)getRowNumber;

- (int32_t)available;

- (BOOL)hasNext;

- (nullable id<LGDatabaseResultSet>)next;

- (void)close;

- (nullable id<LGDatabaseError>)getError;

@end

NS_ASSUME_NONNULL_END
