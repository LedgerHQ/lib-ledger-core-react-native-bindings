// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from stellar_like_wallet.djinni

#include "StellarLikeTransaction.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGStellarLikeTransaction;

namespace djinni_generated {

class StellarLikeTransaction
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::StellarLikeTransaction>;
    using CppOptType = std::shared_ptr<::ledger::core::api::StellarLikeTransaction>;
    using ObjcType = LGStellarLikeTransaction*;

    using Boxed = StellarLikeTransaction;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

