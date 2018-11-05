#import "LGHttpClientImpl.h"
#import "LGHttpUrlConnectionImpl.h"
#import "../objc/LGHttpRequest.h"

@implementation LGHttpClientImpl
/**
*Execute a giver Http request
*@param request, HttpRequest object, request to execute
*/
- (void)execute:(nullable LGHttpRequest *)request
{
    NSURL *URL = [NSURL URLWithString:[request getUrl]];

    NSMutableURLRequest *urlRequest = [NSMutableURLRequest requestWithURL:URL];

    NSDictionary *headers = [request getHeaders];
    for(id key in headers){
        [urlRequest setValue:[headers objectForKey:key] forHTTPHeaderField:key];
    }

    NSData *body = [request getBody];
    if ([body length] > 0) {
        [urlRequest setHTTPMethod:@"POST"];
        [urlRequest addValue: @"application/json; charset=utf-8" forHTTPHeaderField: @"Content-Type"];
        NSString * dataLength = [NSString stringWithFormat: @"%ld", [body length]];
        [urlRequest addValue: dataLength forHTTPHeaderField: @"Content-Length"];
        [urlRequest setHTTPBody:body];
    }
    [[[NSURLSession sharedSession] dataTaskWithRequest:urlRequest completionHandler:^(NSData * _Nullable data, NSURLResponse * _Nullable response, NSError * _Nullable error) {
        LGHttpUrlConnectionImpl *urlConnection = [[LGHttpUrlConnectionImpl alloc] initWithData:data url:response andError:error];
        LGError *objcError = nil;
        if (error) {
            objcError = [[LGError alloc] initWithCode:(LGErrorCode)[error code] message:[error description]];
        }
        [request complete:urlConnection error:objcError];
    }] resume];
}
@end
