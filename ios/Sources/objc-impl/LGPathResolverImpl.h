#import <Foundation/Foundation.h>
#import "../objc/LGPathResolver.h"

@interface LGPathResolverImpl : NSObject<LGPathResolver>
@property(nonatomic, strong) NSString *rootPath;
@property(nonatomic, strong) NSString *majorVersion;
@end
