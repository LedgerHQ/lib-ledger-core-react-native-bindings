// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from secp256k1.djinni

#import "RCTCoreLGSecp256k1.h"


@implementation RCTCoreLGSecp256k1
//Export module
RCT_EXPORT_MODULE(RCTCoreLGSecp256k1)

@synthesize bridge = _bridge;

-(instancetype)init
{
    self = [super init];
    //Init Objc implementation
    if(self)
    {
        self.objcImplementations = [[NSMutableDictionary alloc] init];
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
        reject(@"impl_call_error", @"Error while calling RCTCoreLGSecp256k1::release, first argument should be an instance of LGSecp256k1", nil);
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
-(NSData *) hexStringToData: (NSString *)hexString 
{
    NSMutableData *data= [[NSMutableData alloc] init];
    unsigned char byte;
    char byteChars[3] = {'\0','\0','\0'};
    for (int i = 0; i < ([hexString length] / 2); i++)
    {
        byteChars[0] = [hexString characterAtIndex: i*2];
        byteChars[1] = [hexString characterAtIndex: i*2 + 1];
        byte = strtol(byteChars, NULL, 16);
        [data appendBytes:&byte length:1];
    }
    return data;
}

/**
 * Create an instance of Secp256k1
 * @return Secp256k1 instance
 */
RCT_REMAP_METHOD(createInstance,createInstanceWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    LGSecp256k1 * objcResult = [LGSecp256k1 createInstance];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGSecp256k1 *rctImpl_objcResult = (RCTCoreLGSecp256k1 *)[self.bridge moduleForName:@"CoreLGSecp256k1"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:objcResult_uuid];
    NSDictionary *result = @{@"type" : @"CoreLGSecp256k1", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGSecp256k1::createInstance", nil);
        return;
    }

}

/**
 * Generates public key from private key.
 * @param privKey 32 byte private key
 * @param compress get compressed (35 bytes) or uncompressed (65 bytes)
 * @return public key can be compressed (35 bytes starting with 02 or 03) or un compressed (65 bytes starting with 04)
 */
RCT_REMAP_METHOD(computePubKey,computePubKey:(NSDictionary *)currentInstance withParams:(NSString *)privKey
                                                                               compress:(BOOL)compress withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGSecp256k1::computePubKey, first argument should be an instance of LGSecp256k1", nil);
        return;
    }
    LGSecp256k1 *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGSecp256k1::computePubKey, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSData *objcParam_0 = [self hexStringToData:privKey];

    NSData * objcResult = [currentInstanceObj computePubKey:objcParam_0 compress:compress];
    NSDictionary *result = @{@"value" : objcResult.description};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGSecp256k1::computePubKey", nil);
        return;
    }

}

/**
 * Signs message using a given private key
 * @param privKey 32 bytes private key
 * @param data 32 bytes message to sign
 * @return 32 bytes signed message
 */
RCT_REMAP_METHOD(sign,sign:(NSDictionary *)currentInstance withParams:(NSString *)privKey
                                                                 data:(NSString *)data withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGSecp256k1::sign, first argument should be an instance of LGSecp256k1", nil);
        return;
    }
    LGSecp256k1 *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGSecp256k1::sign, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSData *objcParam_0 = [self hexStringToData:privKey];

    NSData *objcParam_1 = [self hexStringToData:data];

    NSData * objcResult = [currentInstanceObj sign:objcParam_0 data:objcParam_1];
    NSDictionary *result = @{@"value" : objcResult.description};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGSecp256k1::sign", nil);
        return;
    }

}

/**
 * Check if message was signed with given signature and public key
 * @param data 32 bytes signed message
 * @param signature 32 bytes signature (generated from private key)
 * @param oubkey 32 bytes public key
 * @return true if message was signed with signature and public key (both issued from same private key)
 */
RCT_REMAP_METHOD(verify,verify:(NSDictionary *)currentInstance withParams:(NSString *)data
                                                                signature:(NSString *)signature
                                                                   pubKey:(NSString *)pubKey withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGSecp256k1::verify, first argument should be an instance of LGSecp256k1", nil);
        return;
    }
    LGSecp256k1 *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGSecp256k1::verify, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSData *objcParam_0 = [self hexStringToData:data];

    NSData *objcParam_1 = [self hexStringToData:signature];

    NSData *objcParam_2 = [self hexStringToData:pubKey];

    BOOL objcResult = [currentInstanceObj verify:objcParam_0 signature:objcParam_1 pubKey:objcParam_2];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGSecp256k1::verify", nil);
        return;
    }

}

RCT_REMAP_METHOD(newInstance,newInstanceWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    LGSecp256k1 * objcResult = [LGSecp256k1 newInstance];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGSecp256k1 *rctImpl_objcResult = (RCTCoreLGSecp256k1 *)[self.bridge moduleForName:@"CoreLGSecp256k1"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:objcResult_uuid];
    NSDictionary *result = @{@"type" : @"CoreLGSecp256k1", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGSecp256k1::newInstance", nil);
        return;
    }

}
@end
