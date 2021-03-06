// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from idl.djinni

#import "LGAlgorandOperationType.h"
#import "LGTimePeriod.h"
#import <Foundation/Foundation.h>
@class LGAlgorandTransaction;
@protocol LGAlgorandAssetAmountCallback;
@protocol LGAlgorandAssetAmountListCallback;
@protocol LGAlgorandAssetParamsCallback;
@protocol LGAlgorandAssetParamsListCallback;
@protocol LGAlgorandTransactionCallback;
@protocol LGAmountCallback;
@protocol LGBoolCallback;
@protocol LGStringCallback;


@interface LGAlgorandAccount : NSObject

/**
 * Get the maximum amount spendable in one transaction
 * @param callback, Callback returning the maximum amount spendable
 * @param operationType, the type of the operation
 */
- (void)getSpendableBalance:(LGAlgorandOperationType)operationType
                   callback:(nullable id<LGAmountCallback>)callback;

/**
 * Get information about a specific asset
 * @param assetId, the unique identifier of the asset to look for
 * @param callback, Callback returning the information about the queried asset
 */
- (void)getAsset:(nonnull NSString *)assetId
        callback:(nullable id<LGAlgorandAssetParamsCallback>)callback;

/**
 * Check if address has a specific asset
 * @param address, the address to check
 * @param assetId, the unique identifier of the asset to look for
 * @param callback, Callback returning the true if the address hold the asset
 */
- (void)hasAsset:(nonnull NSString *)address
         assetId:(nonnull NSString *)assetId
        callback:(nullable id<LGBoolCallback>)callback;

/**
 * Check if address can receive the given amount:
 * it may not be enough to reach the minimum balance, if the account has 0 ALGO
 * @param address, the address to check
 * @param amount, the amount to test
 * @param callback, Callback returning the true if the address hold the asset
 */
- (void)isAmountValid:(nonnull NSString *)address
               amount:(nonnull NSString *)amount
             callback:(nullable id<LGBoolCallback>)callback;

/**
 * Get balance of account for a particular asset.
 * @param assetId, the unique identifier of the asset on the algorand network
 * @param callback, if getAssetBalance succeeds, Callback returning an Amount object which represents account's balance
 */
- (void)getAssetBalance:(nonnull NSString *)assetId
               callback:(nullable id<LGAlgorandAssetAmountCallback>)callback;

/**
 * Get balance of account for a particular asset at a precise interval with a certain granularity
 * @param assetId, the unique identifier of the asset on the algorand network
 * @param start, lower bound of search range
 * @param end, upper bound of search range
 * @param precision, granularity at which we want results
 * @param callback, ListCallback returning a list of Amount objects which represents account's balance
 */
- (void)getAssetBalanceHistory:(nonnull NSString *)assetId
                         start:(nonnull NSString *)start
                           end:(nonnull NSString *)end
                        period:(LGTimePeriod)period
                      callback:(nullable id<LGAlgorandAssetAmountListCallback>)callback;

/**
 * Get balances of all assets to which account is registered
 * @param callback, ListCallback returning a list of AlgorandAssetAmount objects representing the different balances
 */
- (void)getAssetsBalances:(nullable id<LGAlgorandAssetAmountListCallback>)callback;

/**
 * Get information about the assets created by account
 * @param callback, ListCallback returning a list of AlgorandAssetParams objects representing the assets created by account
 */
- (void)getCreatedAssets:(nullable id<LGAlgorandAssetParamsListCallback>)callback;

/**
 * Get the pending rewards for account
 * @param callback, Callback returning the amount of pending rewards in MicroAlgos
 */
- (void)getPendingRewards:(nullable id<LGAmountCallback>)callback;

/**
 * Get the total rewards of MicroAlgos account has received, including pending rewards.
 * @param callback, Callback returning the total rewards in MicroAlgos.
 */
- (void)getTotalRewards:(nullable id<LGAmountCallback>)callback;

/**
 * Get an estimation (in MicroAlgos) of the fees needed to broadcast a given transaction to the algorand network
 * @param transaction, the transaction for which fees are estimated
 * @param callback, Callback returning the fees in MicroAlgos for the specified transaction
 */
- (void)getFeeEstimate:(nullable LGAlgorandTransaction *)transaction
              callback:(nullable id<LGAmountCallback>)callback;

/**
 * Build a raw signed transaction from a raw unsigned transaction and the signature
 * @param rawUnsignedTransaction, the msgpack-encoded unsigned transaction
 * @param signature, the signature of the transaction
 * @return binary, the msgpack-encoded signed transaction
 */
- (nonnull NSData *)buildRawSignedTransaction:(nonnull NSData *)rawUnsignedTransaction
                                    signature:(nonnull NSData *)signature;

/**
 * Broadcast a raw transaction to the algorand network
 * @param transaction, the msgpack-encoded transaction
 * @param callback, Callback returning the id of the transaction in case of success, an error message otherwise
 */
- (void)broadcastRawTransaction:(nonnull NSData *)transaction
                       callback:(nullable id<LGStringCallback>)callback;

/**
 * Broadcast an AlgorandTransaction object to the algorand network
 * @param transaction, the transaction to broadcast
 * @param callback, Callback returning the fees in MicroAlgos for the specified transaction
 */
- (void)broadcastTransaction:(nullable LGAlgorandTransaction *)transaction
                    callback:(nullable id<LGStringCallback>)callback;

/**
 * Create a new transaction
 * @param callback, The new transaction
 */
- (void)createTransaction:(nullable id<LGAlgorandTransactionCallback>)callback;

@end
