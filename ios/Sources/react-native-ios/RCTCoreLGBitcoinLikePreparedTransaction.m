// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#import "RCTCoreLGBitcoinLikePreparedTransaction.h"
#import "LGBitcoinLikePreparedTransaction.h"

@implementation RCTCoreLGBitcoinLikePreparedTransaction

//Export module
RCT_EXPORT_MODULE(RCTCoreLGBitcoinLikePreparedTransaction)

@synthesize bridge = _bridge;
-(instancetype)init
{
    self = [super init];
    //Init Objc implementation
    if(self)
    {
        self.objcImplementations = [[NSMutableDictionary alloc] init];
        self.implementationsData = [[NSMutableDictionary alloc] init];
    }
    return self;
}

+ (BOOL)requiresMainQueueSetup
{
    return NO;
}
RCT_REMAP_METHOD(release, release:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikePreparedTransaction::release, first argument should be an instance of LGBitcoinLikePreparedTransaction", nil);
        return;
    }
    [self.objcImplementations removeObjectForKey:currentInstance[@"uid"]];
    resolve(@(YES));
}
RCT_REMAP_METHOD(log, logWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    NSMutableArray *uuids = [[NSMutableArray alloc] init];
    for (id key in self.objcImplementations)
    {
        [uuids addObject:key];
    }
    NSDictionary *result = @{@"value" : uuids};
    resolve(result);
}
RCT_REMAP_METHOD(flush, flushWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self.objcImplementations removeAllObjects];
    resolve(@(YES));
}
RCT_REMAP_METHOD(isNull, isNull:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        resolve(@(YES));
        return;
    }
    if ([self.objcImplementations objectForKey:currentInstance[@"uid"]])
    {
        resolve(@(NO));
        return;
    }
    resolve(@(YES));
}
RCT_REMAP_METHOD(init, initWithVersion:(int)version
                                inputs:(NSArray <NSDictionary *> *)inputs
                                 paths:(nonnull NSArray<NSString *> *)paths
                               outputs:(NSArray <NSDictionary *> *)outputs
                              lockTime:(int)lockTime withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    NSMutableDictionary *implementationsData = [[NSMutableDictionary alloc] init];
    NSMutableArray *field_1 = [[NSMutableArray alloc] init];

    NSMutableArray *field_1_data = [[NSMutableArray alloc] init];

    for (id inputs_elem in inputs)
    {
        RCTCoreLGBitcoinLikeOutput *rctParam_inputs_elem = (RCTCoreLGBitcoinLikeOutput *)[self.bridge moduleForName:@"CoreLGBitcoinLikeOutput"];
        LGBitcoinLikeOutput *field_1_elem = (LGBitcoinLikeOutput *)[rctParam_inputs_elem.objcImplementations objectForKey:inputs_elem[@"uid"]];
        [field_1_data addObject:inputs_elem[@"uid"]];
        [field_1 addObject:field_1_elem];

    }
    [implementationsData setObject:field_1_data forKey:@"inputs"];

    NSMutableArray *field_3 = [[NSMutableArray alloc] init];

    NSMutableArray *field_3_data = [[NSMutableArray alloc] init];

    for (id outputs_elem in outputs)
    {
        RCTCoreLGBitcoinLikeOutput *rctParam_outputs_elem = (RCTCoreLGBitcoinLikeOutput *)[self.bridge moduleForName:@"CoreLGBitcoinLikeOutput"];
        LGBitcoinLikeOutput *field_3_elem = (LGBitcoinLikeOutput *)[rctParam_outputs_elem.objcImplementations objectForKey:outputs_elem[@"uid"]];
        [field_3_data addObject:outputs_elem[@"uid"]];
        [field_3 addObject:field_3_elem];

    }
    [implementationsData setObject:field_3_data forKey:@"outputs"];



    LGBitcoinLikePreparedTransaction * finalResult = [[LGBitcoinLikePreparedTransaction alloc] initWithVersion:version inputs:field_1 paths:paths outputs:field_3 lockTime:lockTime];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikePreparedTransaction *rctImpl = (RCTCoreLGBitcoinLikePreparedTransaction *)[self.bridge moduleForName:@"CoreLGBitcoinLikePreparedTransaction"];
    [rctImpl.objcImplementations setObject:finalResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikePreparedTransaction", @"uid" : uuid };
    if (result)
    {
        [self.implementationsData setObject:implementationsData forKey:uuid];
        resolve(result);
    }
}

-(void)mapImplementationsData:(NSDictionary *)currentInstance
{
    LGBitcoinLikePreparedTransaction *objcImpl = (LGBitcoinLikePreparedTransaction *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSMutableDictionary *implementationsData = [[NSMutableDictionary alloc] init];
    id field_1 = objcImpl.inputs;
    NSMutableArray *converted_field_1 = [[NSMutableArray alloc] init];
    for (id field_1_elem in field_1)
    {
        NSString *field_1_elem_uuid = [[NSUUID UUID] UUIDString];
        RCTCoreLGBitcoinLikeOutput *rctImpl_field_1_elem = (RCTCoreLGBitcoinLikeOutput *)[self.bridge moduleForName:@"CoreLGBitcoinLikeOutput"];
        [rctImpl_field_1_elem.objcImplementations setObject:field_1_elem forKey:field_1_elem_uuid];
        NSDictionary *converted_field_1_elem = @{@"type" : @"CoreLGBitcoinLikeOutput", @"uid" : field_1_elem_uuid };
        [converted_field_1 addObject:converted_field_1_elem];
    }
    [implementationsData setObject:converted_field_1 forKey:@"inputs"];
    id field_3 = objcImpl.outputs;
    NSMutableArray *converted_field_3 = [[NSMutableArray alloc] init];
    for (id field_3_elem in field_3)
    {
        NSString *field_3_elem_uuid = [[NSUUID UUID] UUIDString];
        RCTCoreLGBitcoinLikeOutput *rctImpl_field_3_elem = (RCTCoreLGBitcoinLikeOutput *)[self.bridge moduleForName:@"CoreLGBitcoinLikeOutput"];
        [rctImpl_field_3_elem.objcImplementations setObject:field_3_elem forKey:field_3_elem_uuid];
        NSDictionary *converted_field_3_elem = @{@"type" : @"CoreLGBitcoinLikeOutput", @"uid" : field_3_elem_uuid };
        [converted_field_3 addObject:converted_field_3_elem];
    }
    [implementationsData setObject:converted_field_3 forKey:@"outputs"];
    [self.implementationsData setObject:implementationsData forKey:currentInstance[@"uid"]];
}
RCT_REMAP_METHOD(getVersion, getVersion:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGBitcoinLikePreparedTransaction *objcImpl = (LGBitcoinLikePreparedTransaction *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : @((int)objcImpl.version)};
    resolve(result);
}

RCT_REMAP_METHOD(getInputs, getInputs:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    NSDictionary *data = (NSDictionary *)[self.implementationsData objectForKey:currentInstance[@"uid"]];
    if (!data)
    {
        [self mapImplementationsData:currentInstance];
        data = (NSDictionary *)[self.implementationsData objectForKey:currentInstance[@"uid"]];
    }
    NSArray<NSDictionary *> *result = [data objectForKey:@"inputs"];
    resolve(result);
}

RCT_REMAP_METHOD(getPaths, getPaths:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGBitcoinLikePreparedTransaction *objcImpl = (LGBitcoinLikePreparedTransaction *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.paths};
    resolve(result);
}

RCT_REMAP_METHOD(getOutputs, getOutputs:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    NSDictionary *data = (NSDictionary *)[self.implementationsData objectForKey:currentInstance[@"uid"]];
    if (!data)
    {
        [self mapImplementationsData:currentInstance];
        data = (NSDictionary *)[self.implementationsData objectForKey:currentInstance[@"uid"]];
    }
    NSArray<NSDictionary *> *result = [data objectForKey:@"outputs"];
    resolve(result);
}

RCT_REMAP_METHOD(getLockTime, getLockTime:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGBitcoinLikePreparedTransaction *objcImpl = (LGBitcoinLikePreparedTransaction *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : @((int)objcImpl.lockTime)};
    resolve(result);
}

@end
