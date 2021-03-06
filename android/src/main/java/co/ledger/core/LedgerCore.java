// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from core.djinni

package co.ledger.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class LedgerCore {
    /** Release the underlying native object */
    public abstract void destroy();

    /**
     * Gets the version of the library as a human readable string.
     * @return The version of the library (e.g. '1.0.1')
     */
    public static native String getStringVersion();

    /**
     * Get the integer version of the Library
     * @return The integer version of the library
     */
    public static native int getIntVersion();

    private static final class CppProxy extends LedgerCore
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
