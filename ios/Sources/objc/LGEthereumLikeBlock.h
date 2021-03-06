// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ethereum_like_wallet.djinni

#import <Foundation/Foundation.h>


/** Class representing Ethereum block. */
@interface LGEthereumLikeBlock : NSObject

/**
 * Hash of block.
 * @return string representing hash of this block
 */
- (nonnull NSString *)getHash;

/**
 * Height of block in blockchain.
 * @return 64 bits integer, height of block
 */
- (int64_t)getHeight;

/**
 * Timestamp when block was mined.
 * @return Date object, date when block was appended to blockchain
 */
- (nonnull NSDate *)getTime;

@end
