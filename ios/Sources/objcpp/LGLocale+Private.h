// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from locale.djinni

#import "LGLocale.h"
#include "Locale.hpp"

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGLocale;

namespace djinni_generated {

struct Locale
{
    using CppType = ::ledger::core::api::Locale;
    using ObjcType = LGLocale*;

    using Boxed = Locale;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCpp(const CppType& cpp);
};

}  // namespace djinni_generated
