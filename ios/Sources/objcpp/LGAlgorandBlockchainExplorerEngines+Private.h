// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from configuration.djinni

#include "AlgorandBlockchainExplorerEngines.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGAlgorandBlockchainExplorerEngines;

namespace djinni_generated {

class AlgorandBlockchainExplorerEngines
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::AlgorandBlockchainExplorerEngines>;
    using CppOptType = std::shared_ptr<::ledger::core::api::AlgorandBlockchainExplorerEngines>;
    using ObjcType = LGAlgorandBlockchainExplorerEngines*;

    using Boxed = AlgorandBlockchainExplorerEngines;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

