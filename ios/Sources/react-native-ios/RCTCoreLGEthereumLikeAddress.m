// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#import "RCTCoreLGEthereumLikeAddress.h"


@implementation RCTCoreLGEthereumLikeAddress
//Export module
RCT_EXPORT_MODULE(RCTCoreLGEthereumLikeAddress)

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
-(NSString *) dataToHexString: (NSData *)data 
{
    const unsigned char *bytes = (const unsigned char *)data.bytes;
    NSMutableString *hex = [NSMutableString new];
    for (NSInteger i = 0; i < data.length; i++)
    {
        [hex appendFormat:@"%02x", bytes[i]];
    }
    return [hex copy];
}

/**
 * Gets the version of the address.
 * @return The version of the address
 */
RCT_REMAP_METHOD(getVersion,getVersion:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGEthereumLikeAddress::getVersion, first argument should be an instance of LGEthereumLikeAddress", nil);
        return;
    }
    LGEthereumLikeAddress *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGEthereumLikeAddress::getVersion, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSData * objcResult = [currentInstanceObj getVersion];
    NSString *objcResultData = [self dataToHexString:objcResult];
    NSDictionary *result = @{@"value" : objcResultData};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGEthereumLikeAddress::getVersion", nil);
        return;
    }

}

/**
 * Gets the raw keccak hash of the public key (truncated to 20 bytes).
 * @return The 20 bytes of the public key keccak hash
 */
RCT_REMAP_METHOD(getKeccakHash,getKeccakHash:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGEthereumLikeAddress::getKeccakHash, first argument should be an instance of LGEthereumLikeAddress", nil);
        return;
    }
    LGEthereumLikeAddress *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGEthereumLikeAddress::getKeccakHash, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSData * objcResult = [currentInstanceObj getKeccakHash];
    NSString *objcResultData = [self dataToHexString:objcResult];
    NSDictionary *result = @{@"value" : objcResultData};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGEthereumLikeAddress::getKeccakHash", nil);
        return;
    }

}

/**
 * Gets the network parameters used for serializing the address.
 * @return The network parameters of the address
 */
RCT_REMAP_METHOD(getNetworkParameters,getNetworkParameters:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGEthereumLikeAddress::getNetworkParameters, first argument should be an instance of LGEthereumLikeAddress", nil);
        return;
    }
    LGEthereumLikeAddress *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGEthereumLikeAddress::getNetworkParameters, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGEthereumLikeNetworkParameters * objcResult = [currentInstanceObj getNetworkParameters];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGEthereumLikeNetworkParameters *rctImpl_objcResult = (RCTCoreLGEthereumLikeNetworkParameters *)[self.bridge moduleForName:@"CoreLGEthereumLikeNetworkParameters"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGEthereumLikeNetworkParameters", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGEthereumLikeAddress::getNetworkParameters", nil);
        return;
    }

}

/**
 * Encodes keccak with respect to EIP55.
 * @return The EIP55 encoding
 */
RCT_REMAP_METHOD(toEIP55,toEIP55:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGEthereumLikeAddress::toEIP55, first argument should be an instance of LGEthereumLikeAddress", nil);
        return;
    }
    LGEthereumLikeAddress *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGEthereumLikeAddress::toEIP55, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSString * objcResult = [currentInstanceObj toEIP55];
    NSDictionary *result = @{@"value" : objcResult};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGEthereumLikeAddress::toEIP55", nil);
        return;
    }

}
@end
