// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#ifndef DJINNI_GENERATED_BITCOINLIKEOPERATION_HPP
#define DJINNI_GENERATED_BITCOINLIKEOPERATION_HPP

#include <memory>

namespace ledger { namespace core { namespace api {

class BitcoinLikeTransaction;

/** Class representing a Bitcoin Operation. */
class BitcoinLikeOperation {
public:
    virtual ~BitcoinLikeOperation() {}

    /**
     * Get operation's transaction.
     * @return BitcoinLikeTransaction object
     */
    virtual std::shared_ptr<BitcoinLikeTransaction> getTransaction() = 0;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_BITCOINLIKEOPERATION_HPP
