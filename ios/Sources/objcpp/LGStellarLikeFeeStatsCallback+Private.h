// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#include "StellarLikeFeeStatsCallback.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@protocol LGStellarLikeFeeStatsCallback;

namespace djinni_generated {

class StellarLikeFeeStatsCallback
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::StellarLikeFeeStatsCallback>;
    using CppOptType = std::shared_ptr<::ledger::core::api::StellarLikeFeeStatsCallback>;
    using ObjcType = id<LGStellarLikeFeeStatsCallback>;

    using Boxed = StellarLikeFeeStatsCallback;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

