// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ripple_like_wallet.djinni

package co.ledger.core;

import java.util.concurrent.atomic.AtomicBoolean;

/**Class representing a Ripple Operation */
public abstract class RippleLikeOperation {
    /**
     *Get operation's transaction
     *@return RippleLikeTransaction object
     */
    public abstract RippleLikeTransaction getTransaction();
    /** Release the underlying native object */
    public abstract void destroy();


    private static final class CppProxy extends RippleLikeOperation
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
        public RippleLikeTransaction getTransaction()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (RippleLikeOperation)");
            }
            return native_getTransaction(this.nativeRef);
        }
        private native RippleLikeTransaction native_getTransaction(long _nativeRef);
    }
}
