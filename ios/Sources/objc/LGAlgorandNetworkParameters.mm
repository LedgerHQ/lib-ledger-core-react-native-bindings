// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

#import "LGAlgorandNetworkParameters.h"


@implementation LGAlgorandNetworkParameters

- (nonnull instancetype)initWithGenesisID:(nonnull NSString *)genesisID
                              genesisHash:(nonnull NSString *)genesisHash
{
    if (self = [super init]) {
        _genesisID = [genesisID copy];
        _genesisHash = [genesisHash copy];
    }
    return self;
}

+ (nonnull instancetype)AlgorandNetworkParametersWithGenesisID:(nonnull NSString *)genesisID
                                                   genesisHash:(nonnull NSString *)genesisHash
{
    return [[self alloc] initWithGenesisID:genesisID
                               genesisHash:genesisHash];
}

- (NSString *)description
{
    return [NSString stringWithFormat:@"<%@ %p genesisID:%@ genesisHash:%@>", self.class, (void *)self, self.genesisID, self.genesisHash];
}

@end