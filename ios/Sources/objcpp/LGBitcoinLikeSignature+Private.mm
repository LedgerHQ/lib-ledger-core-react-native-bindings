// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#import "LGBitcoinLikeSignature+Private.h"
#import "DJIMarshal+Private.h"
#include <cassert>

namespace djinni_generated {

auto BitcoinLikeSignature::toCpp(ObjcType obj) -> CppType
{
    assert(obj);
    return {::djinni::Binary::toCpp(obj.r),
            ::djinni::Binary::toCpp(obj.s),
            ::djinni::Binary::toCpp(obj.v)};
}

auto BitcoinLikeSignature::fromCpp(const CppType& cpp) -> ObjcType
{
    return [[LGBitcoinLikeSignature alloc] initWithR:(::djinni::Binary::fromCpp(cpp.r))
                                                   s:(::djinni::Binary::fromCpp(cpp.s))
                                                   v:(::djinni::Binary::fromCpp(cpp.v))];
}

}  // namespace djinni_generated