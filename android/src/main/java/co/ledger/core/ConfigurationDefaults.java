// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from configuration.djinni

package co.ledger.core;

import java.util.concurrent.atomic.AtomicBoolean;

/** Default values you might want to use if you don’t know what values you should use. */
public abstract class ConfigurationDefaults {
    /** The default Ledger API endpoint for the explorers. */
    public static final String BLOCKCHAIN_DEFAULT_API_ENDPOINT = "https://explorers.api.live.ledger.com";

    /** The default Ledger API endpoint for the observers. */
    public static final String BLOCKCHAIN_OBSERVER_WS_ENDPOINT = "wss://ws.ledgerwallet.com/blockchain/v2/{}/ws";

    /** The default derivation scheme for BIP44 derivation. */
    public static final String BIP44_DERIVATION_SCHEME = "44'/<coin_type>'/<account>'/<node>/<address>";

    /** Default keychain policy. */
    public static final String DEFAULT_KEYCHAIN = "BIP32_P2PKH";

    /** Default trust limit (block height). */
    public static final int DEFAULT_TRUST_LIMIT = 3;

    /** Default observable range for HD keychains */
    public static final int KEYCHAIN_DEFAULT_OBSERVABLE_RANGE = 20;

    /** Default TTL for cache */
    public static final int DEFAULT_TTL_CACHE = 30;

    /** Default connection pool size for PostgreSQL */
    public static final int DEFAULT_PG_CONNECTION_POOL_SIZE = 25;

    /** Release the underlying native object */
    public abstract void destroy();


    private static final class CppProxy extends ConfigurationDefaults
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        @Override
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }
    }
}
