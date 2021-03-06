// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from database.djinni

#import <Foundation/Foundation.h>
@protocol LGDatabaseError;
@protocol LGDatabaseResultRow;


/**
 * ResultSet is a cursor over a query result. It allows user to iterate through query rows. When you start iterating through
 * result the cursor is placed before the first element of the set.
 */
@protocol LGDatabaseResultSet

/**
 * Retrieve the current row pointed by the DatabaseResultSet. Return null if there is no row to retrieve.
 * @return The current row
 */
- (nullable id<LGDatabaseResultRow>)getRow;

/** Get the number of rows updated by the query (UPDATE, INSERT, DELETE...) */
- (int32_t)getUpdateCount;

/**
 * Returns true if the result set has at least one remaining row to get.
 * @return true if the result set has at least one remaining row to get, false otherwise.
 */
- (BOOL)hasNext;

/**
 * Returns the number of remaining rows before the result set needs to load more rows
 * @return The number of remaining rows before the result set needs to load more rows.
 */
- (int32_t)available;

/**
 * Internally move the result set to the next available row. This method may fail if there is no further row to fetch.
 * @return Return a result set pointing to the next row.
 */
- (void)next;

/** Close the result set. */
- (void)close;

/** Get the last error that occured on the database. */
- (nullable id<LGDatabaseError>)getError;

@end
