// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from configuration.djinni

#import "LGAlgorandBlockchainExplorerEngines+Private.h"
#import "LGAlgorandBlockchainExplorerEngines.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGAlgorandBlockchainExplorerEngines ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::AlgorandBlockchainExplorerEngines>&)cppRef;

@end

@implementation LGAlgorandBlockchainExplorerEngines {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::AlgorandBlockchainExplorerEngines>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::AlgorandBlockchainExplorerEngines>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}


namespace djinni_generated {

auto AlgorandBlockchainExplorerEngines::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto AlgorandBlockchainExplorerEngines::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGAlgorandBlockchainExplorerEngines>(cpp);
}

}  // namespace djinni_generated

@end
