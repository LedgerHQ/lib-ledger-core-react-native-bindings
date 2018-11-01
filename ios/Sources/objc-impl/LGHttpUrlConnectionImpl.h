#import <Foundation/Foundation.h>
#import "../objc/LGHttpUrlConnection.h"
#import <React/RCTBridgeModule.h>

@interface LGHttpUrlConnectionImpl : NSObject <LGHttpUrlConnection>
@property (nonatomic) RCTPromiseResolveBlock resolve;
@property (nonatomic) RCTPromiseRejectBlock reject;
@property(nonatomic, strong) NSData *data;
@property(nonatomic, strong) NSURLResponse *response;
@property(nonatomic, strong) NSError *error;
-(instancetype) initWithData:(NSData *)data url:(NSURLResponse *)response andError:(NSError *)error;
@end
