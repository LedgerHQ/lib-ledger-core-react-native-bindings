// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package co.ledger.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/** The trust indicator of an operation. */
public abstract class TrustIndicator {
    public abstract int getTrustWeight();

    public abstract TrustLevel getTrustLevel();

    public abstract ArrayList<String> getConflictingOperationUids();

    public abstract String getOrigin();
    /** Release the underlying native object */
    public abstract void destroy();


    private static final class CppProxy extends TrustIndicator
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

        @Override
        public int getTrustWeight()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (TrustIndicator)");
            }
            return native_getTrustWeight(this.nativeRef);
        }
        private native int native_getTrustWeight(long _nativeRef);

        @Override
        public TrustLevel getTrustLevel()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (TrustIndicator)");
            }
            return native_getTrustLevel(this.nativeRef);
        }
        private native TrustLevel native_getTrustLevel(long _nativeRef);

        @Override
        public ArrayList<String> getConflictingOperationUids()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (TrustIndicator)");
            }
            return native_getConflictingOperationUids(this.nativeRef);
        }
        private native ArrayList<String> native_getConflictingOperationUids(long _nativeRef);

        @Override
        public String getOrigin()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (TrustIndicator)");
            }
            return native_getOrigin(this.nativeRef);
        }
        private native String native_getOrigin(long _nativeRef);
    }
}
