//
//  LGDatabaseColumnImpl.h
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "LGDatabaseColumn.h"
#import "LGDatabaseValueType.h"

NS_ASSUME_NONNULL_BEGIN

@interface LGDatabaseColumnImpl : NSObject<LGDatabaseColumn>

- (LGDatabaseValueType)getType;

- (nonnull NSString *)getName;

@end

NS_ASSUME_NONNULL_END
