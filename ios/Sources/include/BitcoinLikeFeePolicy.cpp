// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#include "BitcoinLikeFeePolicy.hpp"  // my header
#include "enum_from_string.hpp"

namespace ledger { namespace core { namespace api {

std::string to_string(const BitcoinLikeFeePolicy& bitcoinLikeFeePolicy) {
    switch (bitcoinLikeFeePolicy) {
        case BitcoinLikeFeePolicy::PER_BYTE: return "PER_BYTE";
        case BitcoinLikeFeePolicy::PER_KBYTE: return "PER_KBYTE";
        default: return "UNKNOWN";
    };
};
template <>
BitcoinLikeFeePolicy from_string(const std::string& bitcoinLikeFeePolicy) {
    if (bitcoinLikeFeePolicy == "PER_BYTE") return BitcoinLikeFeePolicy::PER_BYTE;
    else return BitcoinLikeFeePolicy::PER_KBYTE;
};

std::ostream &operator<<(std::ostream &os, const BitcoinLikeFeePolicy &o)
{
    switch (o) {
        case BitcoinLikeFeePolicy::PER_BYTE:  return os << "PER_BYTE";
        case BitcoinLikeFeePolicy::PER_KBYTE:  return os << "PER_KBYTE";
    }
}

} } }  // namespace ledger::core::api
