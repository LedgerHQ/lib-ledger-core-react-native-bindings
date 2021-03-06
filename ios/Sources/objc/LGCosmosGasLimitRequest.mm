// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "LGCosmosGasLimitRequest.h"


@implementation LGCosmosGasLimitRequest

- (nonnull instancetype)initWithMemo:(nullable NSString *)memo
                            messages:(nonnull NSArray<LGCosmosLikeMessage *> *)messages
                           amplifier:(nullable NSString *)amplifier
{
    if (self = [super init]) {
        _memo = [memo copy];
        _messages = [messages copy];
        _amplifier = [amplifier copy];
    }
    return self;
}

+ (nonnull instancetype)CosmosGasLimitRequestWithMemo:(nullable NSString *)memo
                                             messages:(nonnull NSArray<LGCosmosLikeMessage *> *)messages
                                            amplifier:(nullable NSString *)amplifier
{
    return [[self alloc] initWithMemo:memo
                             messages:messages
                            amplifier:amplifier];
}

- (NSString *)description
{
    return [NSString stringWithFormat:@"<%@ %p memo:%@ messages:%@ amplifier:%@>", self.class, (void *)self, self.memo, self.messages, self.amplifier];
}

@end
