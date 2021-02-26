// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#import "RCTCoreLGBitcoinLikeTransactionBuilder.h"


@implementation RCTCoreLGBitcoinLikeTransactionBuilder
//Export module
RCT_EXPORT_MODULE(RCTCoreLGBitcoinLikeTransactionBuilder)

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
 * Add the given input to the final transaction.
 * @param transactionhash The hash of the transaction in where the UTXO can be located.
 * @params index Index of the UTXO in the previous transaction
 * @params sequence Sequence number to add at the end of the input serialization. This can be used for RBF transaction
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(addInput,addInput:(NSDictionary *)currentInstance withParams:(nonnull NSString *)transactionHash
                                                                        index:(int)index
                                                                     sequence:(int)sequence withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::addInput, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::addInput, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj addInput:transactionHash index:index sequence:sequence];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::addInput", nil);
        return;
    }

}

/**
 * Add the given output to the final transaction.
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(addOutput,addOutput:(NSDictionary *)currentInstance withParams:(NSDictionary *)amount
                                                                         script:(NSDictionary *)script withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::addOutput, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::addOutput, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAmount *rctParam_amount = (RCTCoreLGAmount *)[self.bridge moduleForName:@"CoreLGAmount"];
    LGAmount *objcParam_0 = (LGAmount *)[rctParam_amount.objcImplementations objectForKey:amount[@"uid"]];
    RCTCoreLGBitcoinLikeScript *rctParam_script = (RCTCoreLGBitcoinLikeScript *)[self.bridge moduleForName:@"CoreLGBitcoinLikeScript"];
    LGBitcoinLikeScript *objcParam_1 = (LGBitcoinLikeScript *)[rctParam_script.objcImplementations objectForKey:script[@"uid"]];
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj addOutput:objcParam_0 script:objcParam_1];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::addOutput", nil);
        return;
    }

}

/**
 * If needed the transaction will send its change to the given path. It is possible to add multiple change path.
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(addChangePath,addChangePath:(NSDictionary *)currentInstance withParams:(nonnull NSString *)path withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::addChangePath, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::addChangePath, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj addChangePath:path];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::addChangePath", nil);
        return;
    }

}

/**
 * Exclude UTXO from the coin selection (alias UTXO picking). You can call this method multiple times to exclude multiple
 * UTXO.
 * @param transactionHash The hash of the transaction in which this UTXO can be found.
 * @param outputIndex The position of the output in the previous transaction,
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(excludeUtxo,excludeUtxo:(NSDictionary *)currentInstance withParams:(nonnull NSString *)transactionHash
                                                                        outputIndex:(int)outputIndex withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::excludeUtxo, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::excludeUtxo, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj excludeUtxo:transactionHash outputIndex:outputIndex];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::excludeUtxo", nil);
        return;
    }

}

/**
 * Set the the number of change addresses in the transaction builder.
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(setNumberOfChangeAddresses,setNumberOfChangeAddresses:(NSDictionary *)currentInstance withParams:(int)count withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::setNumberOfChangeAddresses, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::setNumberOfChangeAddresses, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj setNumberOfChangeAddresses:count];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::setNumberOfChangeAddresses", nil);
        return;
    }

}

/**
 * Set the maximum amount per change output. By default there is no max amount.
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(setMaxAmountOnChange,setMaxAmountOnChange:(NSDictionary *)currentInstance withParams:(NSDictionary *)amount withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::setMaxAmountOnChange, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::setMaxAmountOnChange, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAmount *rctParam_amount = (RCTCoreLGAmount *)[self.bridge moduleForName:@"CoreLGAmount"];
    LGAmount *objcParam_0 = (LGAmount *)[rctParam_amount.objcImplementations objectForKey:amount[@"uid"]];
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj setMaxAmountOnChange:objcParam_0];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::setMaxAmountOnChange", nil);
        return;
    }

}

/**
 * Set the minimum amount per change output. By default this value is the dust value of the currency.
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(setMinAmountOnChange,setMinAmountOnChange:(NSDictionary *)currentInstance withParams:(NSDictionary *)amount withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::setMinAmountOnChange, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::setMinAmountOnChange, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAmount *rctParam_amount = (RCTCoreLGAmount *)[self.bridge moduleForName:@"CoreLGAmount"];
    LGAmount *objcParam_0 = (LGAmount *)[rctParam_amount.objcImplementations objectForKey:amount[@"uid"]];
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj setMinAmountOnChange:objcParam_0];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::setMinAmountOnChange", nil);
        return;
    }

}

/**
 * Set the UTXO picking strategy (see [[BitcoinLikePickingStrategy]]).
 * @param strategy The strategy to adopt in order to select which input to use in the transaction.
 * @param sequence The sequence value serialized at the end of the raw transaction. If you don't know what to put here
 * just use 0xFFFFFF
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(pickInputs,pickInputs:(NSDictionary *)currentInstance withParams:(int)strategy
                                                                         sequence:(int)sequence withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::pickInputs, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::pickInputs, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj pickInputs:(LGBitcoinLikePickingStrategy)strategy sequence:sequence];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::pickInputs", nil);
        return;
    }

}

/**
 * Send funds to the given address. This method can be called multiple times to send to multiple addresses.
 * @param amount The value to send
 * @param address Address of the recipient
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(sendToAddress,sendToAddress:(NSDictionary *)currentInstance withParams:(NSDictionary *)amount
                                                                                address:(nonnull NSString *)address withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::sendToAddress, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::sendToAddress, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAmount *rctParam_amount = (RCTCoreLGAmount *)[self.bridge moduleForName:@"CoreLGAmount"];
    LGAmount *objcParam_0 = (LGAmount *)[rctParam_amount.objcImplementations objectForKey:amount[@"uid"]];
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj sendToAddress:objcParam_0 address:address];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::sendToAddress", nil);
        return;
    }

}

/**
 * Send all available funds to the given address.
 * @param address Address of the recipient
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(wipeToAddress,wipeToAddress:(NSDictionary *)currentInstance withParams:(nonnull NSString *)address withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::wipeToAddress, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::wipeToAddress, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj wipeToAddress:address];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::wipeToAddress", nil);
        return;
    }

}

/**
 * Set the amount of fees per byte (of the raw transaction).
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(setFeesPerByte,setFeesPerByte:(NSDictionary *)currentInstance withParams:(NSDictionary *)fees withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::setFeesPerByte, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::setFeesPerByte, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGAmount *rctParam_fees = (RCTCoreLGAmount *)[self.bridge moduleForName:@"CoreLGAmount"];
    LGAmount *objcParam_0 = (LGAmount *)[rctParam_fees.objcImplementations objectForKey:fees[@"uid"]];
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj setFeesPerByte:objcParam_0];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::setFeesPerByte", nil);
        return;
    }

}

/** Build a transaction from the given builder parameters. */
RCT_REMAP_METHOD(build,build:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::build, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::build, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGBitcoinLikeTransactionCallback *objcParam_0 = [[RCTCoreLGBitcoinLikeTransactionCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj build:objcParam_0];

}

/**
 * Creates a clone of this builder.
 * @return A copy of the current builder instance.
 */
RCT_REMAP_METHOD(clone,clone:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::clone, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::clone, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj clone];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransactionBuilder"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransactionBuilder", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::clone", nil);
        return;
    }

}

/** Reset the current instance to its initial state. */
RCT_REMAP_METHOD(reset,reset:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGBitcoinLikeTransactionBuilder::reset, first argument should be an instance of LGBitcoinLikeTransactionBuilder", nil);
        return;
    }
    LGBitcoinLikeTransactionBuilder *currentInstanceObj = nil;
    @synchronized(self)
    {
        currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    }
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGBitcoinLikeTransactionBuilder::reset, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    [currentInstanceObj reset];
    resolve(@(YES));

}

/**
 * Parsing unsigned transaction.
 * parsing a tx might change depending on block height we are on (if an update is effective starting from a given hight)
 */
RCT_REMAP_METHOD(parseRawUnsignedTransaction,parseRawUnsignedTransactionwithParams:(NSDictionary *)currency
                                                                    rawTransaction:(NSString *)rawTransaction
                                                                currentBlockHeight:(int)currentBlockHeight withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    RCTCoreLGCurrency *rctParam_currency = (RCTCoreLGCurrency *)[self.bridge moduleForName:@"CoreLGCurrency"];
    LGCurrency *objcParam_0 = (LGCurrency *)[rctParam_currency.objcImplementations objectForKey:currency[@"uid"]];
    NSData *objcParam_1 = [self hexStringToData:rawTransaction];

    LGBitcoinLikeTransaction * objcResult = [LGBitcoinLikeTransactionBuilder parseRawUnsignedTransaction:objcParam_0 rawTransaction:objcParam_1 currentBlockHeight:currentBlockHeight];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeTransaction *rctImpl_objcResult = (RCTCoreLGBitcoinLikeTransaction *)[self.bridge moduleForName:@"CoreLGBitcoinLikeTransaction"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeTransaction", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGBitcoinLikeTransactionBuilder::parseRawUnsignedTransaction", nil);
        return;
    }

}
@end
