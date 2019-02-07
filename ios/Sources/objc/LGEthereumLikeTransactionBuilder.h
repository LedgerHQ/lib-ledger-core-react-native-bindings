// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ethereum_like_wallet.djinni

#import "LGCurrency.h"
#import <Foundation/Foundation.h>
@class LGAmount;
@class LGEthereumLikeTransaction;
@class LGEthereumLikeTransactionBuilder;
@protocol LGEthereumLikeTransactionCallback;


/**
 * Builder for transactions on the Ethereum blockchain.
 *
 * Use this interface when you want to build a transaction step by step.
 */
@interface LGEthereumLikeTransactionBuilder : NSObject

/**
 * Send funds to the given address. This method can be called multiple times to send to multiple addresses.
 * @param amount The value to send
 * @param address Address of the recipient
 * @return A reference on the same builder in order to chain calls.
 */
- (nullable LGEthereumLikeTransactionBuilder *)sendToAddress:(nullable LGAmount *)amount
                                                     address:(nonnull NSString *)address;

/**
 * Send all available funds to the given address.
 * @param address Address of the recipient
 * @return A reference on the same builder in order to chain calls.
 */
- (nullable LGEthereumLikeTransactionBuilder *)wipeToAddress:(nonnull NSString *)address;

/**
 * Set gas price (in wei) the originator is willing to pay.
 * @return A reference on the same builder in order to chain calls.
 */
- (nullable LGEthereumLikeTransactionBuilder *)setGasPrice:(nullable LGAmount *)gasPrice;

/**
 * Set gas limit (in wei) the originator is not willing to exceed.
 * @return A reference on the same builder in order to chain calls.
 */
- (nullable LGEthereumLikeTransactionBuilder *)setGasLimit:(nullable LGAmount *)gasLimit;

/** Set input data the originator wants to embed in transaction. */
- (nullable LGEthereumLikeTransactionBuilder *)setInputData:(nonnull NSData *)data;

/** Build a transaction from the given builder parameters. */
- (void)build:(nullable id<LGEthereumLikeTransactionCallback>)callback;

/**
 * Create a clone of this builder.
 * @return A copy of the current builder instance.
 */
- (nullable LGEthereumLikeTransactionBuilder *)clone;

/** Reset the current instance to its initial state */
- (void)reset;

/** Create an unsigned transaction for the Ethereum blockchain out of a raw binary. */
+ (nullable LGEthereumLikeTransaction *)parseRawUnsignedTransaction:(nonnull LGCurrency *)currency
                                                     rawTransaction:(nonnull NSData *)rawTransaction;

/** Create a signed transaction for the Ethereum blockchain out of a raw binary. */
+ (nullable LGEthereumLikeTransaction *)parseRawSignedTransaction:(nonnull LGCurrency *)currency
                                                   rawTransaction:(nonnull NSData *)rawTransaction;

@end
