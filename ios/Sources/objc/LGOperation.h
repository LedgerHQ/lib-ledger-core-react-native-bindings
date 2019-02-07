// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "LGCurrency.h"
#import "LGOperationType.h"
#import "LGWalletType.h"
#import <Foundation/Foundation.h>
@class LGAmount;
@class LGBitcoinLikeOperation;
@class LGEthereumLikeOperation;
@class LGPreferences;
@class LGTrustIndicator;


/** Class representing an operation. */
@interface LGOperation : NSObject

/**
 * Get id's operation.
 * @return string
 */
- (nonnull NSString *)getUid;

/**
 * Get account's index in user's wallet.
 * @return 32-bit integer
 */
- (int32_t)getAccountIndex;

/**
 * Get type of operation.
 * @return OperationType object (for more details refer to OperationType)
 */
- (LGOperationType)getOperationType;

/**
 * Return date on which operation was issued.
 * @return date object
 */
- (nonnull NSDate *)getDate;

/**
 * Get senders of operation.
 * @return List of string, list of all senders
 */
- (nonnull NSArray<NSString *> *)getSenders;

/**
 * Get recipients of operation.
 * @return List of string, list of all recipients
 */
- (nonnull NSArray<NSString *> *)getRecipients;

/**
 * Get amount of operation.
 * @return Amount object
 */
- (nullable LGAmount *)getAmount;

/**
 * Get fees of operation.
 * @return Optional Amount object
 */
- (nullable LGAmount *)getFees;

/**
 * Get preferences of operation.
 * @return Prefences object
 */
- (nullable LGPreferences *)getPreferences;

/**
 * Get trust indicator of operation.
 * @return TrustIndicator object
 */
- (nullable LGTrustIndicator *)getTrust;

/**
 * Get block height on which operation was included.
 * @return Optional 64-bit integer, height of block in which operation was validated
 */
- (nullable NSNumber *)getBlockHeight;

/**
 * Convert operation as Bitcoin operation.
 * @return BitcoinLikeOperation object
 */
- (nullable LGBitcoinLikeOperation *)asBitcoinLikeOperation;

/**
 * Convert operation as Ethereum operation.
 * @return EthereumLikeOperation object
 */
- (nullable LGEthereumLikeOperation *)asEthereumLikeOperation;

/** Is this an instance of a Bitcoin-like operation? */
- (BOOL)isInstanceOfBitcoinLikeOperation;

/** Same as isInstanceOfBitcoinLikeOperation for ethereum. */
- (BOOL)isInstanceOfEthereumLikeOperation;

/** Same as isInstanceOfBitcoinLikeOperation for ripple. */
- (BOOL)isInstanceOfRippleLikeOperation;

/**
 * Tells if the operation is complete.
 * @return boolean
 */
- (BOOL)isComplete;

/**
 * Get type of wallet from which operation was issued.
 * @return WalletType object
 */
- (LGWalletType)getWalletType;

/** Get the currency this operation is about. */
- (nonnull LGCurrency *)getCurrency;

@end
