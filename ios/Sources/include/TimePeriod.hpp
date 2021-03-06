// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#ifndef DJINNI_GENERATED_TIMEPERIOD_HPP
#define DJINNI_GENERATED_TIMEPERIOD_HPP

#include <functional>
#include <iostream>
#include <string>

namespace ledger { namespace core { namespace api {

enum class TimePeriod : int {
    HOUR,
    DAY,
    WEEK,
    MONTH,
};
 std::string to_string(const TimePeriod& timePeriod);
 std::ostream &operator<<(std::ostream &os, const TimePeriod &o);

} } }  // namespace ledger::core::api

namespace std {

template <>
struct hash<::ledger::core::api::TimePeriod> {
    size_t operator()(::ledger::core::api::TimePeriod type) const {
        return std::hash<int>()(static_cast<int>(type));
    }
};

}  // namespace std
#endif //DJINNI_GENERATED_TIMEPERIOD_HPP
