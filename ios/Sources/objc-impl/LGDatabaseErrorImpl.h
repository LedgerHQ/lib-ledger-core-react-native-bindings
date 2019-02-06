//
//  LGDatabaseErrorImpl.h
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <LGDatabaseError.h>

NS_ASSUME_NONNULL_BEGIN

@interface LGDatabaseErrorImpl : NSObject<LGDatabaseError>

- (nonnull NSString *)getMessage;

@end

NS_ASSUME_NONNULL_END
