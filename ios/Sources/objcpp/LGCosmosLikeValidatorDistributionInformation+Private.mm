// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from validators.djinni

#import "LGCosmosLikeValidatorDistributionInformation+Private.h"
#import "DJIMarshal+Private.h"
#include <cassert>

namespace djinni_generated {

auto CosmosLikeValidatorDistributionInformation::toCpp(ObjcType obj) -> CppType
{
    assert(obj);
    return {::djinni::String::toCpp(obj.selfBondRewards),
            ::djinni::String::toCpp(obj.validatorCommission)};
}

auto CosmosLikeValidatorDistributionInformation::fromCpp(const CppType& cpp) -> ObjcType
{
    return [[LGCosmosLikeValidatorDistributionInformation alloc] initWithSelfBondRewards:(::djinni::String::fromCpp(cpp.selfBondRewards))
                                                                     validatorCommission:(::djinni::String::fromCpp(cpp.validatorCommission))];
}

}  // namespace djinni_generated
