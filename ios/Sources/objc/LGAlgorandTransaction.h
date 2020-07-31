// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

#import "LGAlgorandAssetConfigurationInfo.h"
#import "LGAlgorandAssetFreezeInfo.h"
#import "LGAlgorandAssetTransferInfo.h"
#import "LGAlgorandParticipationInfo.h"
#import "LGAlgorandPaymentInfo.h"
#import <Foundation/Foundation.h>


@interface LGAlgorandTransaction : NSObject

- (nonnull NSString *)getId;

- (nonnull NSString *)getType;

- (nonnull NSString *)getSender;

- (nonnull NSString *)getFee;

- (nonnull NSString *)getNote;

- (nonnull NSString *)getRound;

- (nonnull NSString *)getSenderRewards;

- (nonnull NSString *)getReceiverRewards;

- (nonnull NSString *)getCloseRewards;

- (void)setSender:(nonnull NSString *)sender;

- (void)setFee:(nonnull NSString *)fee;

- (void)setNote:(nonnull NSString *)note;

- (void)setPaymentInfo:(nonnull LGAlgorandPaymentInfo *)info;

- (nonnull LGAlgorandPaymentInfo *)getPaymentInfo;

- (void)setParticipationInfo:(nonnull LGAlgorandParticipationInfo *)info;

- (nonnull LGAlgorandParticipationInfo *)getParticipationInfo;

- (void)setAssetConfigurationInfo:(nonnull LGAlgorandAssetConfigurationInfo *)info;

- (nonnull LGAlgorandAssetConfigurationInfo *)getAssetConfigurationInfo;

- (void)setAssetTransferInfo:(nonnull LGAlgorandAssetTransferInfo *)info;

- (nonnull LGAlgorandAssetTransferInfo *)getAssetTransferInfo;

- (void)setAssetFreezeInfo:(nonnull LGAlgorandAssetFreezeInfo *)info;

- (nonnull LGAlgorandAssetFreezeInfo *)getAssetFreezeInfo;

/** Serialize the transaction in MsgPack format */
- (nonnull NSData *)serialize;

- (void)setSignature:(nonnull NSData *)signature;

@end