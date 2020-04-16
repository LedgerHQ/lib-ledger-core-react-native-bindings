// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "LGQueryFilter+Private.h"
#import "LGQueryFilter.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#import "LGAmount+Private.h"
#import "LGOperationType+Private.h"
#import "LGTrustLevel+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGQueryFilter ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::QueryFilter>&)cppRef;

@end

@implementation LGQueryFilter {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::QueryFilter>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::QueryFilter>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}

+ (nullable LGQueryFilter *)accountEq:(nonnull NSString *)accountUid {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::accountEq(::djinni::String::toCpp(accountUid));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)accountNeq:(nonnull NSString *)accountUid {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::accountNeq(::djinni::String::toCpp(accountUid));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)dateLte:(nonnull NSDate *)time {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::dateLte(::djinni::Date::toCpp(time));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)dateLt:(nonnull NSDate *)time {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::dateLt(::djinni::Date::toCpp(time));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)dateGt:(nonnull NSDate *)time {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::dateGt(::djinni::Date::toCpp(time));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)dateGte:(nonnull NSDate *)time {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::dateGte(::djinni::Date::toCpp(time));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)dateEq:(nonnull NSDate *)time {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::dateEq(::djinni::Date::toCpp(time));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)dateNeq:(nonnull NSDate *)time {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::dateNeq(::djinni::Date::toCpp(time));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)containsRecipient:(nonnull NSString *)recipientAddress {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::containsRecipient(::djinni::String::toCpp(recipientAddress));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)containsSender:(nonnull NSString *)senderAddress {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::containsSender(::djinni::String::toCpp(senderAddress));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)currencyEq:(nonnull NSString *)currencyName {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::currencyEq(::djinni::String::toCpp(currencyName));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)operationUidEq:(nonnull NSString *)operationUid {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::operationUidEq(::djinni::String::toCpp(operationUid));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)operationUidNeq:(nonnull NSString *)operationUid {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::operationUidNeq(::djinni::String::toCpp(operationUid));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)trustEq:(LGTrustLevel)trust {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::trustEq(::djinni::Enum<::ledger::core::api::TrustLevel, LGTrustLevel>::toCpp(trust));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)trustNeq:(LGTrustLevel)trust {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::trustNeq(::djinni::Enum<::ledger::core::api::TrustLevel, LGTrustLevel>::toCpp(trust));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)feesEq:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::feesEq(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)feesNeq:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::feesNeq(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)feesGte:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::feesGte(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)feesGt:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::feesGt(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)feesLte:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::feesLte(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)feesLt:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::feesLt(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)amountEq:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::amountEq(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)amountNeq:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::amountNeq(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)amountGte:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::amountGte(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)amountGt:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::amountGt(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)amountLte:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::amountLte(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)amountLt:(nullable LGAmount *)amount {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::amountLt(::djinni_generated::Amount::toCpp(amount));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)blockHeightEq:(int32_t)blockHeight {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::blockHeightEq(::djinni::I32::toCpp(blockHeight));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)blockHeightNeq:(int32_t)blockHeight {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::blockHeightNeq(::djinni::I32::toCpp(blockHeight));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)blockHeightGte:(int32_t)blockHeight {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::blockHeightGte(::djinni::I32::toCpp(blockHeight));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)blockHeightGt:(int32_t)blockHeight {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::blockHeightGt(::djinni::I32::toCpp(blockHeight));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)blockHeightLte:(int32_t)blockHeight {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::blockHeightLte(::djinni::I32::toCpp(blockHeight));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)blockHeightLt:(int32_t)blockHeight {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::blockHeightLt(::djinni::I32::toCpp(blockHeight));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)blockHeightIsNull {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::blockHeightIsNull();
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)operationTypeEq:(LGOperationType)operationType {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::operationTypeEq(::djinni::Enum<::ledger::core::api::OperationType, LGOperationType>::toCpp(operationType));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

+ (nullable LGQueryFilter *)operationTypeNeq:(LGOperationType)operationType {
    try {
        auto objcpp_result_ = ::ledger::core::api::QueryFilter::operationTypeNeq(::djinni::Enum<::ledger::core::api::OperationType, LGOperationType>::toCpp(operationType));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGQueryFilter *)opAnd:(nullable LGQueryFilter *)filter {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->op_and(::djinni_generated::QueryFilter::toCpp(filter));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGQueryFilter *)opOr:(nullable LGQueryFilter *)filter {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->op_or(::djinni_generated::QueryFilter::toCpp(filter));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGQueryFilter *)opAndNot:(nullable LGQueryFilter *)filter {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->op_and_not(::djinni_generated::QueryFilter::toCpp(filter));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGQueryFilter *)opOrNot:(nullable LGQueryFilter *)filter {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->op_or_not(::djinni_generated::QueryFilter::toCpp(filter));
        return ::djinni_generated::QueryFilter::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace djinni_generated {

auto QueryFilter::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto QueryFilter::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGQueryFilter>(cpp);
}

}  // namespace djinni_generated

@end
