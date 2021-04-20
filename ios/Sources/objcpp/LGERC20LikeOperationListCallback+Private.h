// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#include "ERC20LikeOperationListCallback.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@protocol LGERC20LikeOperationListCallback;

namespace djinni_generated {

class ERC20LikeOperationListCallback
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::ERC20LikeOperationListCallback>;
    using CppOptType = std::shared_ptr<::ledger::core::api::ERC20LikeOperationListCallback>;
    using ObjcType = id<LGERC20LikeOperationListCallback>;

    using Boxed = ERC20LikeOperationListCallback;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

