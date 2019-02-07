// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#ifndef DJINNI_GENERATED_BITCOINLIKEWALLETCONFIGURATION_HPP
#define DJINNI_GENERATED_BITCOINLIKEWALLETCONFIGURATION_HPP

#include <string>

namespace ledger { namespace core { namespace api {

/** Class of constants to set Bitcoin like wallet configurations. */
class BitcoinLikeWalletConfiguration {
public:
    virtual ~BitcoinLikeWalletConfiguration() {}

    /** String keychain's name. */
    static std::string const KEYCHAIN;

    /** String observer's name. */
    static std::string const OBSERVER;

    /** String explorer's name. */
    static std::string const EXPLORER;

    /** String synchronizer's name. */
    static std::string const SYNCHRONIZER;

    /** String with Payment Script type and BIP on which hierarchical wallet is based. */
    static std::string const KEYCHAIN_P2PKH_BIP44;

    /** String websocket on which observer receives notifications from explorer. */
    static std::string const OBSERVER_LEDGER_WEBSOCKET;

    /** String explorer api. */
    static std::string const EXPLORER_LEDGER_API;

    /** String synchronizer by default. */
    static std::string const SYNCHRONIZER_DEFAULT;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_BITCOINLIKEWALLETCONFIGURATION_HPP
