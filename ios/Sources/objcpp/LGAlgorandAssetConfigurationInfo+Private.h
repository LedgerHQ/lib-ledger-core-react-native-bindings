// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

#import "LGAlgorandAssetConfigurationInfo.h"
#include "AlgorandAssetConfigurationInfo.hpp"

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGAlgorandAssetConfigurationInfo;

namespace djinni_generated {

struct AlgorandAssetConfigurationInfo
{
    using CppType = ::ledger::core::api::AlgorandAssetConfigurationInfo;
    using ObjcType = LGAlgorandAssetConfigurationInfo*;

    using Boxed = AlgorandAssetConfigurationInfo;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCpp(const CppType& cpp);
};

}  // namespace djinni_generated
