#import "LGHttpUrlConnectionImpl.h"
#import "../objc/LGHttpReadBodyResult.h"

@implementation LGHttpUrlConnectionImpl

@synthesize resolve = _resolve;
@synthesize reject = _reject;

-(instancetype) initWithData:(NSData *)data url:(NSURLResponse *)response andError:(NSError *)error
{
    self = [super init];
    if (self) {
        self.data = data;
        self.response = response;
        self.error = error;
    }
    return self;
}
/**
* Gets the HTTP response status code
* @return The HTTP response status code
*/
- (int32_t)getStatusCode
{
    return(int32_t)[(NSHTTPURLResponse*) self.response statusCode];
}

/**
* Gets the HTTP response status text
* @return The HTTP response status text
*/
- (nonnull NSString *)getStatusText
{
    return [(NSHTTPURLResponse*) self.response description];
}

/**
* Gets the HTTP response headers
* @return The HTTP response headers
*/
- (nonnull NSDictionary<NSString *, NSString *> *)getHeaders
{
    return [(NSHTTPURLResponse*) self.response allHeaderFields];
}

/**
* Reads available HTTP response body. This method will be called multiple times until it returns a empty bytes array.
* @returns A chunk of the body data wrapped into a HttpReadBodyResult (for error management)
*/
- (nonnull LGHttpReadBodyResult *)readBody
{
    
    LGError *objcError = nil;
    if (self.error) {
        objcError = [[LGError alloc] initWithCode:(LGErrorCode)[self.error code] message:[self.error description]];
    }
    NSError *error;
    NSDictionary *jsonDict = [NSJSONSerialization JSONObjectWithData:self.data options:0 error:&error];
    NSString *jsonString = [NSString stringWithFormat:@"%@", jsonDict];
    LGHttpReadBodyResult *body = [[LGHttpReadBodyResult alloc] initWithError:objcError data:self.data];
    return body;
}
@end
