// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#import <Foundation/Foundation.h>
@class LGAmount;
@class LGBitcoinLikeOutput;

/** Structure representing a bitcoin transaction request. */
@interface LGBitcoinLikeTransactionRequest : NSObject
- (nonnull instancetype)initWithUtxo:(nonnull NSArray<LGBitcoinLikeOutput *> *)utxo
                             outputs:(nonnull NSArray<LGBitcoinLikeOutput *> *)outputs
                            baseFees:(nullable LGAmount *)baseFees
                           totalFees:(nullable LGAmount *)totalFees
                            lockTime:(nullable NSNumber *)lockTime;
+ (nonnull instancetype)BitcoinLikeTransactionRequestWithUtxo:(nonnull NSArray<LGBitcoinLikeOutput *> *)utxo
                                                      outputs:(nonnull NSArray<LGBitcoinLikeOutput *> *)outputs
                                                     baseFees:(nullable LGAmount *)baseFees
                                                    totalFees:(nullable LGAmount *)totalFees
                                                     lockTime:(nullable NSNumber *)lockTime;

/** List of BitcoinLikeOutput objects, UTXO (Unspent Transaction Outputs) consumed by transaction's inputs. */
@property (nonatomic, readonly, nonnull) NSArray<LGBitcoinLikeOutput *> * utxo;

/** List of BitcoinLikeOutput objects, transaction's output. */
@property (nonatomic, readonly, nonnull) NSArray<LGBitcoinLikeOutput *> * outputs;

/** Optional Amount object, amount of base fees. */
@property (nonatomic, readonly, nullable) LGAmount * baseFees;

/** Optional Amount object, amount of total fees. */
@property (nonatomic, readonly, nullable) LGAmount * totalFees;

/** Optional 32 bits integer, transaction's lock time (refer to BitcoinLikeTransaction class). */
@property (nonatomic, readonly, nullable) NSNumber * lockTime;

@end
