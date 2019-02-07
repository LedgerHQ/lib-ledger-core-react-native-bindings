//
//  LGEthereumLikeTransactionCallbackImpl.h
//  RNLibLedgerCore
//
//  Created by dsabadie on 07/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "LGEthereumLikeTransactionCallback.h"

NS_ASSUME_NONNULL_BEGIN

@interface LGEthereumLikeTransactionCallbackImpl : NSObject<LGEthereumLikeTransactionCallback>

- (void)onCallback:(nullable LGEthereumLikeTransaction *)result
             error:(nullable LGError *)error;

@end

NS_ASSUME_NONNULL_END
