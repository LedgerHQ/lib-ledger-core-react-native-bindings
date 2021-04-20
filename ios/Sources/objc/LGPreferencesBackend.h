// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from preferences.djinni

#import "LGPreferencesChange.h"
#import <Foundation/Foundation.h>
@protocol LGRandomNumberGenerator;


/** Interface describing the behaviour of the backend used by Preferences. */
@protocol LGPreferencesBackend

/**
 * Gets the value associated to the given key.
 * @param key The data key.
 * @return The value associated to the key if it exists, an empty option otherwise.
 */
- (nullable NSData *)get:(nonnull NSData *)key;

/**
 * Commit a change.
 * @param changes The list of changes to commit.
 * @return false if unsuccessful (might happen if the underlying DB was destroyed).
 */
- (BOOL)commit:(nonnull NSArray<LGPreferencesChange *> *)changes;

/**
 * Turn encryption on for all future uses.
 * This method will set encryption on for all future values that will be persisted.
 * If this function is called on a plaintext storage (i.e. first encryption for
 * instance), it will also encrypt all data already present.
 * @param rng Random number generator used to generate the encryption salt.
 * @param password The new password.
 */
- (void)setEncryption:(nullable id<LGRandomNumberGenerator>)rng
             password:(nonnull NSString *)password;

/**
 * Turn off encryption by disabling the use of the internal cipher. Data is left
 * untouched.
 * This method is suitable when you want to get back raw, encrypted data. If you want
 * to disable encryption in order to read clear data back without password, consider
 * the resetEncryption method instead.
 */
- (void)unsetEncryption;

/**
 * Reset the encryption with a new password by first decrypting on the
 * fly with the old password the data present.
 * If the new password is an empty string, after this method is called, the database
 * is completely unciphered and no password is required to read from it.
 * @return true if the reset occurred correctly, false otherwise (e.g. trying to change
 * password with an old password but without a proper salt already persisted).
 */
- (BOOL)resetEncryption:(nullable id<LGRandomNumberGenerator>)rng
            oldPassword:(nonnull NSString *)oldPassword
            newPassword:(nonnull NSString *)newPassword;

/**
 * Get encryption salt, if any.
 * @return the encryption salt if it exists, an empty string otherwise.
 */
- (nonnull NSString *)getEncryptionSalt;

/** Clear all preferences. */
- (void)clear;

@end
