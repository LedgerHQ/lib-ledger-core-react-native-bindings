// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ripple_like_wallet.djinni

package co.ledger.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class RippleConfigurationDefaults {
    public static final String RIPPLE_DEFAULT_API_ENDPOINT = "https://data.ripple.com";

    public static final String RIPPLE_OBSERVER_NODE_ENDPOINT_S2 = "https://s2.ripple.com";

    public static final String RIPPLE_OBSERVER_NODE_ENDPOINT_S3 = "https://s3.ripple.com";

    public static final String RIPPLE_OBSERVER_WS_ENDPOINT_S2 = "wss://s2.ripple.com";

    public static final String RIPPLE_OBSERVER_WS_ENDPOINT_S3 = "wss://s3.ripple.com";

    public static final String RIPPLE_DEFAULT_PORT = "51234";

    public static final int RIPPLE_DEFAULT_LAST_LEDGER_SEQUENCE_OFFSET = 4;

    /** Release the underlying native object */
    public abstract void destroy();


    private static final class CppProxy extends RippleConfigurationDefaults
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
