// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

#import "LGAlgorandParticipationInfo+Private.h"
#import "DJIMarshal+Private.h"
#include <cassert>

namespace djinni_generated {

auto AlgorandParticipationInfo::toCpp(ObjcType obj) -> CppType
{
    assert(obj);
    return {::djinni::String::toCpp(obj.rootPublicKey),
            ::djinni::String::toCpp(obj.vrfPublicKey),
            ::djinni::String::toCpp(obj.voteKeyDilution),
            ::djinni::String::toCpp(obj.voteFirstRound),
            ::djinni::String::toCpp(obj.voteLastRound)};
}

auto AlgorandParticipationInfo::fromCpp(const CppType& cpp) -> ObjcType
{
    return [[LGAlgorandParticipationInfo alloc] initWithRootPublicKey:(::djinni::String::fromCpp(cpp.rootPublicKey))
                                                         vrfPublicKey:(::djinni::String::fromCpp(cpp.vrfPublicKey))
                                                      voteKeyDilution:(::djinni::String::fromCpp(cpp.voteKeyDilution))
                                                       voteFirstRound:(::djinni::String::fromCpp(cpp.voteFirstRound))
                                                        voteLastRound:(::djinni::String::fromCpp(cpp.voteLastRound))];
}

}  // namespace djinni_generated
