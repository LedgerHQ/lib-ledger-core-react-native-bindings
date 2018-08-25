#import "LGEventReceiverImpl.h"
#import "../objc/LGEvent.h"
#import "../objc/LGEventCode.h"
#import "../objc/LGDynamicObject.h"
@implementation LGEventReceiverImpl
/**
*Method triggered when an event occurs
*@param event, Event object that triggers this method
*/
- (void)onEvent:(nullable LGEvent *)event
{
    LGEventCode eventCode = [event getCode];
    if (eventCode == LGEventCodeUndefined || eventCode == LGEventCodeSynchronizationFailed) {
        LGDynamicObject *payload = [event getPayload];
        NSString *error = [[NSString alloc] init];
        if (payload) {
            error = [payload getString:@"EV_SYNC_ERROR_MESSAGE"];
        } else {
            error = @"Syncronization Failed";
        }
        //TODO: Call to rejecter
    } else if (eventCode == LGEventCodeSynchronizationSucceed || eventCode == LGEventCodeSynchronizationSucceedOnPreviouslyEmptyAccount) {
        //TODO: Call to resolver
        
    }
}
@end
