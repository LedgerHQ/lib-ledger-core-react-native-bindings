#import <Foundation/Foundation.h>
#import <React/RCTBridgeModule.h>
#import "../objc/LGExecutionContext.h"

@interface LGExecutionContextImpl : NSObject<LGExecutionContext>
@property (nonatomic) RCTPromiseResolveBlock resolve;
@property (nonatomic) RCTPromiseRejectBlock reject;
@property(nonatomic) dispatch_queue_t queue;
- (instancetype)initContextWithName:(NSString *)name andIsSerialized:(BOOL)isSerialized;
@end
