// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "LGCosmosGasLimitRequest.h"
#import <Foundation/Foundation.h>
@class LGCosmosLikeTransaction;
@class LGCosmosLikeTransactionBuilder;
@protocol LGAmountCallback;
@protocol LGBigIntCallback;
@protocol LGCosmosLikeDelegationListCallback;
@protocol LGCosmosLikeRedelegationListCallback;
@protocol LGCosmosLikeRewardListCallback;
@protocol LGCosmosLikeUnbondingListCallback;
@protocol LGCosmosLikeValidatorCallback;
@protocol LGCosmosLikeValidatorListCallback;
@protocol LGStringCallback;


/**Class representing a Cosmos account */
@interface LGCosmosLikeAccount : NSObject

- (void)broadcastRawTransaction:(nonnull NSString *)transaction
                       callback:(nullable id<LGStringCallback>)callback;

- (void)broadcastTransaction:(nullable LGCosmosLikeTransaction *)transaction
                    callback:(nullable id<LGStringCallback>)callback;

- (nullable LGCosmosLikeTransactionBuilder *)buildTransaction;

/** Get estimated gas limit to set so the transaction will succeed */
- (void)getEstimatedGasLimit:(nullable LGCosmosLikeTransaction *)transaction
                    callback:(nullable id<LGBigIntCallback>)callback;

/**
 * Ask the account to estimate the gas for a building transaction
 * This function uses the underlying infrastructure to simulate the gas
 * needed for the transaction as requested until now.
 * @param request is the CosmosGasLimitRequest for the specifics of the simulation
 */
- (void)estimateGas:(nonnull LGCosmosGasLimitRequest *)buildingTx
           callback:(nullable id<LGBigIntCallback>)callback;

/** Get the latest active validator set */
- (void)getLatestValidatorSet:(nullable id<LGCosmosLikeValidatorListCallback>)callback;

/** Get information about one validator */
- (void)getValidatorInfo:(nonnull NSString *)validatorAddress
                callback:(nullable id<LGCosmosLikeValidatorCallback>)callback;

/** Get Total balance of account. Sum of spendable, delegated, pending rewards, and pending unbondings */
- (void)getTotalBalance:(nullable id<LGAmountCallback>)callback;

/** Get Total amount in delegation of account. */
- (void)getDelegatedBalance:(nullable id<LGAmountCallback>)callback;

/** Get Total pending rewards of account. */
- (void)getPendingRewardsBalance:(nullable id<LGAmountCallback>)callback;

/** Get Total unbondings funds of account. */
- (void)getUnbondingBalance:(nullable id<LGAmountCallback>)callback;

/** Get Total spendable balance of account. */
- (void)getSpendableBalance:(nullable id<LGAmountCallback>)callback;

- (void)getDelegations:(nullable id<LGCosmosLikeDelegationListCallback>)callback;

- (void)getPendingRewards:(nullable id<LGCosmosLikeRewardListCallback>)callback;

- (void)getUnbondings:(nullable id<LGCosmosLikeUnbondingListCallback>)callback;

- (void)getRedelegations:(nullable id<LGCosmosLikeRedelegationListCallback>)callback;

/**
 * Get the current account sequence (synchronize to get latest value)
 * string like "14"
 */
- (void)getSequence:(nullable id<LGStringCallback>)callback;

/**
 * Get the account number
 * String like "15"
 */
- (void)getAccountNumber:(nullable id<LGStringCallback>)callback;

/**
 * Get the rewards withdrawal address
 * String Bech32 encoded string
 */
- (void)getWithdrawAddress:(nullable id<LGStringCallback>)callback;

@end
