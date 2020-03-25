// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#import "LGStellarLikeTransactionCallback+Private.h"
#import "LGStellarLikeTransactionCallback.h"
#import "DJIMarshal+Private.h"
#import "DJIObjcWrapperCache+Private.h"
#import "LGError+Private.h"
#import "LGStellarLikeTransaction+Private.h"
#include <stdexcept>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

namespace djinni_generated {

class StellarLikeTransactionCallback::ObjcProxy final
: public ::ledger::core::api::StellarLikeTransactionCallback
, private ::djinni::ObjcProxyBase<ObjcType>
{
    friend class ::djinni_generated::StellarLikeTransactionCallback;
public:
    using ObjcProxyBase::ObjcProxyBase;
    void onCallback(const std::shared_ptr<::ledger::core::api::StellarLikeTransaction> & c_result, const std::experimental::optional<::ledger::core::api::Error> & c_error) override
    {
        @autoreleasepool {
            [djinni_private_get_proxied_objc_object() onCallback:(::djinni::Optional<std::experimental::optional, ::djinni_generated::StellarLikeTransaction>::fromCpp(c_result))
                                                           error:(::djinni::Optional<std::experimental::optional, ::djinni_generated::Error>::fromCpp(c_error))];
        }
    }
};

}  // namespace djinni_generated

namespace djinni_generated {

auto StellarLikeTransactionCallback::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return ::djinni::get_objc_proxy<ObjcProxy>(objc);
}

auto StellarLikeTransactionCallback::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return dynamic_cast<ObjcProxy&>(*cpp).djinni_private_get_proxied_objc_object();
}

}  // namespace djinni_generated
