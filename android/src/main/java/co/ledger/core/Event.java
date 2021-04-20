// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from emitter.djinni

package co.ledger.core;

import java.util.concurrent.atomic.AtomicBoolean;

/** Class representing an event. */
public abstract class Event {
    /**
     * Get event code (for more details, please refer to EventCode enum).
     * @return EventCode enum entry
     */
    public abstract EventCode getCode();

    /**
     * Get payload of event.
     * @return DynamicObject object
     */
    public abstract DynamicObject getPayload();

    /**
     * Tell whether the event is a sticky one.
     * @return bool
     */
    public abstract boolean isSticky();

    /**
     * If event is sticky, return sticky tag.
     * @return 32 bits integer
     */
    public abstract int getStickyTag();
    /** Release the underlying native object */
    public abstract void destroy();


    /**
     * Create a new instance of Event class.
     * @param code, EventCode enum entry
     * @param payload, DynamicObject object
     * @return Event instance
     */
    public static native Event newInstance(EventCode code, DynamicObject payload);

    private static final class CppProxy extends Event
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
        public EventCode getCode()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Event)");
            }
            return native_getCode(this.nativeRef);
        }
        private native EventCode native_getCode(long _nativeRef);

        @Override
        public DynamicObject getPayload()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Event)");
            }
            return native_getPayload(this.nativeRef);
        }
        private native DynamicObject native_getPayload(long _nativeRef);

        @Override
        public boolean isSticky()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Event)");
            }
            return native_isSticky(this.nativeRef);
        }
        private native boolean native_isSticky(long _nativeRef);

        @Override
        public int getStickyTag()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Event)");
            }
            return native_getStickyTag(this.nativeRef);
        }
        private native int native_getStickyTag(long _nativeRef);
    }
}
