// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

#import "RCTCoreLGAlgorandAssetConfigurationInfo.h"
#import "LGAlgorandAssetConfigurationInfo.h"

@implementation RCTCoreLGAlgorandAssetConfigurationInfo

//Export module
RCT_EXPORT_MODULE(RCTCoreLGAlgorandAssetConfigurationInfo)

@synthesize bridge = _bridge;

+ (BOOL)requiresMainQueueSetup
{
    return NO;
}
RCT_REMAP_METHOD(release, release:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseRelease:currentInstance withResolver: resolve rejecter:reject];
}
RCT_REMAP_METHOD(log, logWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseLogWithResolver:resolve rejecter:reject];
}
RCT_REMAP_METHOD(flush, flushWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseFlushWithResolver:resolve rejecter:reject];
}
RCT_REMAP_METHOD(isNull, isNull:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseIsNull:currentInstance withResolver:resolve rejecter:reject];
}
RCT_REMAP_METHOD(init, initWithAssetId:(nullable NSString *)assetId
                           assetParams:(nullable NSDictionary *)assetParams withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    NSMutableDictionary *implementationsData = [[NSMutableDictionary alloc] init];
    RCTCoreLGAlgorandAssetParams *rctParam_assetParams = (RCTCoreLGAlgorandAssetParams *)[self.bridge moduleForName:@"CoreLGAlgorandAssetParams"];
    LGAlgorandAssetParams *field_1 = (LGAlgorandAssetParams *)[rctParam_assetParams.objcImplementations objectForKey:assetParams[@"uid"]];
    [implementationsData setObject:assetParams[@"uid"] forKey:@"assetParams"];


    LGAlgorandAssetConfigurationInfo * finalResult = [[LGAlgorandAssetConfigurationInfo alloc] initWithAssetId:assetId assetParams:field_1];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGAlgorandAssetConfigurationInfo *rctImpl = (RCTCoreLGAlgorandAssetConfigurationInfo *)[self.bridge moduleForName:@"CoreLGAlgorandAssetConfigurationInfo"];
    NSArray *finalResultArray = [[NSArray alloc] initWithObjects:finalResult, uuid, nil];
    [rctImpl baseSetObject:finalResultArray];
    NSDictionary *result = @{@"type" : @"CoreLGAlgorandAssetConfigurationInfo", @"uid" : uuid };
    if (result)
    {
        [self.implementationsData setObject:implementationsData forKey:uuid];
        resolve(result);
    }
}

-(void)mapImplementationsData:(NSDictionary *)currentInstance
{
    LGAlgorandAssetConfigurationInfo *objcImpl = (LGAlgorandAssetConfigurationInfo *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSMutableDictionary *implementationsData = [[NSMutableDictionary alloc] init];
    id field_1 = objcImpl.assetParams;
    NSString *field_1_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGAlgorandAssetParams *rctImpl_field_1 = (RCTCoreLGAlgorandAssetParams *)[self.bridge moduleForName:@"CoreLGAlgorandAssetParams"];
    if (field_1)
    {
        NSArray *field_1_array = [[NSArray alloc] initWithObjects:field_1, field_1_uuid, nil];
        [rctImpl_field_1 baseSetObject:field_1_array];
    }
    NSDictionary *converted_field_1 = @{@"type" : @"CoreLGAlgorandAssetParams", @"uid" : field_1_uuid };
    [implementationsData setObject:converted_field_1 forKey:@"assetParams"];
    [self.implementationsData setObject:implementationsData forKey:currentInstance[@"uid"]];
}
RCT_REMAP_METHOD(getAssetId, getAssetId:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGAlgorandAssetConfigurationInfo *objcImpl = (LGAlgorandAssetConfigurationInfo *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.assetId};
    resolve(result);
}

RCT_REMAP_METHOD(getAssetParams, getAssetParams:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    NSDictionary *data = (NSDictionary *)[self.implementationsData objectForKey:currentInstance[@"uid"]];
    if (!data)
    {
        [self mapImplementationsData:currentInstance];
        data = (NSDictionary *)[self.implementationsData objectForKey:currentInstance[@"uid"]];
    }
    NSDictionary *result = [data objectForKey:@"assetParams"];
    resolve(result);
}

@end
