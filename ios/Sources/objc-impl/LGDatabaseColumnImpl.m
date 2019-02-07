//
//  LGDatabaseColumnImpl.m
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "LGDatabaseColumnImpl.h"

@implementation LGDatabaseColumnImpl

- (LGDatabaseValueType)getType {
    NSAssert(false, @"missing implementation");
    return LGDatabaseValueTypeBlob;
}

- (nonnull NSString *)getName {
    NSAssert(false, @"missing implementation");
    return nil;
}

@end
