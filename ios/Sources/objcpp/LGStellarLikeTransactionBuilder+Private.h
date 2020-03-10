// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from stellar_like_wallet.djinni

#include "StellarLikeTransactionBuilder.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGStellarLikeTransactionBuilder;

namespace djinni_generated {

class StellarLikeTransactionBuilder
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::StellarLikeTransactionBuilder>;
    using CppOptType = std::shared_ptr<::ledger::core::api::StellarLikeTransactionBuilder>;
    using ObjcType = LGStellarLikeTransactionBuilder*;

    using Boxed = StellarLikeTransactionBuilder;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated
