// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import <Foundation/Foundation.h>

/** Structure of a block in the blockchain. */
@interface LGBlock : NSObject
- (nonnull instancetype)initWithBlockHash:(nonnull NSString *)blockHash
                                      uid:(nonnull NSString *)uid
                                     time:(nonnull NSDate *)time
                             currencyName:(nonnull NSString *)currencyName
                                   height:(int32_t)height;
+ (nonnull instancetype)BlockWithBlockHash:(nonnull NSString *)blockHash
                                       uid:(nonnull NSString *)uid
                                      time:(nonnull NSDate *)time
                              currencyName:(nonnull NSString *)currencyName
                                    height:(int32_t)height;

/** String, block's hash. */
@property (nonatomic, readonly, nonnull) NSString * blockHash;

/** String, id of block (usually height of block). */
@property (nonatomic, readonly, nonnull) NSString * uid;

/** Date on which block was mined. */
@property (nonatomic, readonly, nonnull) NSDate * time;

/** String, currency's name of blockchain the block belongs to. */
@property (nonatomic, readonly, nonnull) NSString * currencyName;

/** 32-bit integer, height of block in the blockchain. */
@property (nonatomic, readonly) int32_t height;

@end
