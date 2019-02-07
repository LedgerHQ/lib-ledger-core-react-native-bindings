// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#ifndef DJINNI_GENERATED_BLOCK_HPP
#define DJINNI_GENERATED_BLOCK_HPP

#include <chrono>
#include <cstdint>
#include <iostream>
#include <string>
#include <utility>

namespace ledger { namespace core { namespace api {

/** Structure of a block in the blockchain. */
struct Block final {
    /** String, block's hash. */
    std::string blockHash;
    /** String, id of block (usually height of block). */
    std::string uid;
    /** Date on which block was mined. */
    std::chrono::system_clock::time_point time;
    /** String, currency's name of blockchain the block belongs to. */
    std::string currencyName;
    /** 64-bit integer, height of block in the blockchain. */
    int64_t height;

    Block(std::string blockHash_,
          std::string uid_,
          std::chrono::system_clock::time_point time_,
          std::string currencyName_,
          int64_t height_)
    : blockHash(std::move(blockHash_))
    , uid(std::move(uid_))
    , time(std::move(time_))
    , currencyName(std::move(currencyName_))
    , height(std::move(height_))
    {}

    Block(const Block& cpy) {
       this->blockHash = cpy.blockHash;
       this->uid = cpy.uid;
       this->time = cpy.time;
       this->currencyName = cpy.currencyName;
       this->height = cpy.height;
    }

    Block() = default;


    Block& operator=(const Block& cpy) {
       this->blockHash = cpy.blockHash;
       this->uid = cpy.uid;
       this->time = cpy.time;
       this->currencyName = cpy.currencyName;
       this->height = cpy.height;
       return *this;
    }

    template <class Archive>
    void load(Archive& archive) {
        archive(blockHash, uid, time, currencyName, height);
    }

    template <class Archive>
    void save(Archive& archive) const {
        archive(blockHash, uid, time, currencyName, height);
    }
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_BLOCK_HPP
