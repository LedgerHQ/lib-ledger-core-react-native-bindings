//
//  LGDatabaseResultRowImpl.h
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "LGDatabaseBlob.h"
#import "LGDatabaseResultRow.h"

NS_ASSUME_NONNULL_BEGIN

@interface LGDatabaseResultRowImpl : NSObject<LGDatabaseResultRow>

- (BOOL)isNullAtPos:(int32_t)pos;

- (nonnull NSString *)getColumnName:(int32_t)pos;

- (int16_t)getShortByPos:(int32_t)pos;

- (int32_t)getIntByPos:(int32_t)pos;

- (float)getFloatByPos:(int32_t)pos;

- (double)getDoubleByPos:(int32_t)pos;

- (int64_t)getLongByPos:(int32_t)pos;

- (nonnull NSString *)getStringByPos:(int32_t)pos;

- (nullable id<LGDatabaseBlob>)getBlobByPos:(int32_t)pos;

@end

NS_ASSUME_NONNULL_END
