//
//  LGDatabaseStatementImpl.h
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "LGDatabaseBlob.h"
#import "LGDatabaseColumn.h"
#import "LGDatabaseResultSet.h"
#import "LGDatabaseStatement.h"

NS_ASSUME_NONNULL_BEGIN

@interface LGDatabaseStatementImpl : NSObject<LGDatabaseStatement>

- (void)bindShort:(int32_t)pos
            value:(int16_t)value;

- (void)bindInt:(int32_t)pos
          value:(int32_t)value;

- (void)bindLong:(int32_t)pos
           value:(int64_t)value;

- (void)bindFloat:(int32_t)pos
            value:(float)value;

- (void)bindDouble:(int32_t)pos
             value:(double)value;

- (void)bindString:(int32_t)pos
             value:(nonnull NSString *)value;

- (void)bindBlob:(int32_t)pos
           value:(nullable id<LGDatabaseBlob>)value;

- (void)bindNull:(int32_t)pos;

- (nullable id<LGDatabaseColumn>)describeColumn:(int32_t)colNum;

- (int32_t)getColumnCount;

- (nullable id<LGDatabaseResultSet>)execute;

- (void)reset;

- (void)close;

@end

NS_ASSUME_NONNULL_END
