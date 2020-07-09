// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from preferences.djinni

#ifndef DJINNI_GENERATED_PREFERENCESCHANGETYPE_HPP
#define DJINNI_GENERATED_PREFERENCESCHANGETYPE_HPP

#include <functional>
#include <iostream>
#include <string>

namespace ledger { namespace core { namespace api {

enum class PreferencesChangeType : int {
    PUT_TYPE,
    DELETE_TYPE,
};
 std::string to_string(const PreferencesChangeType& preferencesChangeType);
 std::ostream &operator<<(std::ostream &os, const PreferencesChangeType &o);

} } }  // namespace ledger::core::api

namespace std {

template <>
struct hash<::ledger::core::api::PreferencesChangeType> {
    size_t operator()(::ledger::core::api::PreferencesChangeType type) const {
        return std::hash<int>()(static_cast<int>(type));
    }
};

}  // namespace std
#endif //DJINNI_GENERATED_PREFERENCESCHANGETYPE_HPP