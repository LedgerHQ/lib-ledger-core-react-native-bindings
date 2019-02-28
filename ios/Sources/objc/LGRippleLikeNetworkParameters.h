// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#import <Foundation/Foundation.h>

@interface LGRippleLikeNetworkParameters : NSObject
- (nonnull instancetype)initWithIdentifier:(nonnull NSString *)Identifier
                             MessagePrefix:(nonnull NSString *)MessagePrefix
                               XPUBVersion:(nonnull NSData *)XPUBVersion
                            AdditionalRIPs:(nonnull NSArray<NSString *> *)AdditionalRIPs
                            TimestampDelay:(int64_t)TimestampDelay;
+ (nonnull instancetype)RippleLikeNetworkParametersWithIdentifier:(nonnull NSString *)Identifier
                                                    MessagePrefix:(nonnull NSString *)MessagePrefix
                                                      XPUBVersion:(nonnull NSData *)XPUBVersion
                                                   AdditionalRIPs:(nonnull NSArray<NSString *> *)AdditionalRIPs
                                                   TimestampDelay:(int64_t)TimestampDelay;

@property (nonatomic, readonly, nonnull) NSString * Identifier;

@property (nonatomic, readonly, nonnull) NSString * MessagePrefix;

@property (nonatomic, readonly, nonnull) NSData * XPUBVersion;

@property (nonatomic, readonly, nonnull) NSArray<NSString *> * AdditionalRIPs;

@property (nonatomic, readonly) int64_t TimestampDelay;

@end
