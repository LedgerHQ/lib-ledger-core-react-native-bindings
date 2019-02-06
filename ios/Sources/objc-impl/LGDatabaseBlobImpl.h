//
//  LGDatabaseBlobImpl.h
//  RNLibLedgerCore
//
//  Created by dsabadie on 06/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <React/RCTBridgeModule.h>
#import "LGDatabaseBlob.h"

NS_ASSUME_NONNULL_BEGIN

@interface LGDatabaseBlobImpl : NSObject<LGDatabaseBlob>

@property (nonatomic) RCTPromiseResolveBlock resolve;

@property (nonatomic) RCTPromiseRejectBlock reject;

- (nonnull NSData *)read:(int64_t)offset
                  length:(int64_t)length;

- (int64_t)write:(int64_t)offset
            data:(nonnull NSData *)data;

- (int64_t)append:(nonnull NSData *)data;

- (int64_t)trim:(int64_t)newLen;

- (int64_t)size;

@end

NS_ASSUME_NONNULL_END
