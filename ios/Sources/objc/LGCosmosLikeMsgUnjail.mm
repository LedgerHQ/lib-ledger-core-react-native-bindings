// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from messages.djinni

#import "LGCosmosLikeMsgUnjail.h"


@implementation LGCosmosLikeMsgUnjail

- (nonnull instancetype)initWithValidatorAddress:(nonnull NSString *)validatorAddress
{
    if (self = [super init]) {
        _validatorAddress = [validatorAddress copy];
    }
    return self;
}

+ (nonnull instancetype)CosmosLikeMsgUnjailWithValidatorAddress:(nonnull NSString *)validatorAddress
{
    return [[self alloc] initWithValidatorAddress:validatorAddress];
}

- (NSString *)description
{
    return [NSString stringWithFormat:@"<%@ %p validatorAddress:%@>", self.class, (void *)self, self.validatorAddress];
}

@end