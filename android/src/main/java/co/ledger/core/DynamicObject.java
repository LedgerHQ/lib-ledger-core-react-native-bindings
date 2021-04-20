// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from dynamic.djinni

package co.ledger.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Class representing an object that stores values of different types of objects,
 * those values are appended dynamically in a map like structure with a given key through which they
 * can be retreived.
 */
public abstract class DynamicObject {
    /**
     * Store a string with a given key.
     * @param key, string, key to access stored value
     * @param value, string
     * @return DynamicObject object with value stored in it
     */
    public abstract DynamicObject putString(String key, String value);

    /**
     * Store a 32-bit integer with a given key.
     * @param key, string, key to access stored value
     * @param value, 32-bit integer
     * @return DynamicObject object with value stored in it
     */
    public abstract DynamicObject putInt(String key, int value);

    /**
     * Store a 64-bit integer with a given key.
     * @param key, string, key to access stored value
     * @param value, 64-bit integer
     * @return DynamicObject object with value stored in it
     */
    public abstract DynamicObject putLong(String key, long value);

    /**
     * Store a double with a given key.
     * @param key, string, key to access stored value
     * @param value, double
     * @return DynamicObject object with value stored in it
     */
    public abstract DynamicObject putDouble(String key, double value);

    /**
     * Store a binary integer with a given key.
     * @param key, string, key to access stored value
     * @param value, binary
     * @return DynamicObject object with value stored in it
     */
    public abstract DynamicObject putData(String key, byte[] value);

    /**
     * Store a boolean integer with a given key.
     * @param key, string, key to access stored value
     * @param value, bool
     * @return DynamicObject object with value stored in it
     */
    public abstract DynamicObject putBoolean(String key, boolean value);

    /**
     * Store another DynamicObject object with a given key.
     * @param key, string, key to access stored value
     * @return DynamicObject object with value stored in it
     */
    public abstract DynamicObject putObject(String key, DynamicObject value);

    /**
     * Store a DynamicArray object with a given key.
     * @param key, string, key to access stored reference
     * @return DynamicArray object with value stored in it
     */
    public abstract DynamicObject putArray(String key, DynamicArray value);

    /**
     * Get, if exists, stored string having a specific key.
     * @param key, string, key of string to look for
     * @return Optional string
     */
    public abstract String getString(String key);

    /**
     * Get, if exists, stored 32 bits integer having a specific key.
     * @param key, string, key of 32 bits integer to look for
     * @return Optional 32 bits integer
     */
    public abstract Integer getInt(String key);

    /**
     * Get, if exists, stored 64 bits integer having a specific key.
     * @param key, string, key of 64 bits integer to look for
     * @return Optional 64 bits integer
     */
    public abstract Long getLong(String key);

    /**
     * Get, if exists, stored double having a specific key.
     * @param key, string, key of double to look for
     * @return Optional double
     */
    public abstract Double getDouble(String key);

    /**
     * Get, if exists, stored binary having a specific key.
     * @param key, string, key of binary to look for
     * @return Optional binary
     */
    public abstract byte[] getData(String key);

    /**
     * Get, if exists, stored bool having a specific key.
     * @param key, string, key of bool to look for
     * @return Optional bool
     */
    public abstract Boolean getBoolean(String key);

    /**
     * Get, if exists, stored DynamicObject having a specific key.
     * @param key, string, key of DynamicObject to look for
     * @return Optional DynamicObject
     */
    public abstract DynamicObject getObject(String key);

    /**
     * Get, if exists, stored DynamicArray having a specific key.
     * @param key, string, key of DynamicArray to look for
     * @return Optional DynamicArray
     */
    public abstract DynamicArray getArray(String key);

    /**
     * Check if a key was used to store a value.
     * @param key, string, key to look for
     * @return bool
     */
    public abstract boolean contains(String key);

    /**
     * Delete key and value stored with it.
     * @param key, string, key to look for
     * @return bool, true if key exists and deletion succeeded, false otherwise
     */
    public abstract boolean remove(String key);

    /**
     * Get list of keys.
     * @return list of string, list all stored keys
     */
    public abstract ArrayList<String> getKeys();

    /**
     * Get type of object stored with specific key.
     * @param key, string, key to look for
     * @return Optional DynamicType enum entry
     */
    public abstract DynamicType getType(String key);

    /**
     * Dump whole object's content as string.
     * @return string
     */
    public abstract String dump();

    /**
     * Serialize whole object to a binary.
     * @return binary
     */
    public abstract byte[] serialize();

    /**
     * Get readonly status of object.
     * @param bool
     */
    public abstract boolean isReadOnly();

    /**
     * Get count of stored references.
     * @return 64 bits integer
     */
    public abstract long size();
    /** Release the underlying native object */
    public abstract void destroy();


    /**
     * Create a new instance of DynamicObject class.
     * @return DynamicObject instance
     */
    public static native DynamicObject newInstance();

    /**
     * Parse a binary to a DynamicObject.
     * @param serialized, binary to parse
     * @return Optional DynamicObject
     */
    public static native DynamicObject load(byte[] serialized);

    private static final class CppProxy extends DynamicObject
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
        public DynamicObject putString(String key, String value)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_putString(this.nativeRef, key, value);
        }
        private native DynamicObject native_putString(long _nativeRef, String key, String value);

        @Override
        public DynamicObject putInt(String key, int value)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_putInt(this.nativeRef, key, value);
        }
        private native DynamicObject native_putInt(long _nativeRef, String key, int value);

        @Override
        public DynamicObject putLong(String key, long value)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_putLong(this.nativeRef, key, value);
        }
        private native DynamicObject native_putLong(long _nativeRef, String key, long value);

        @Override
        public DynamicObject putDouble(String key, double value)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_putDouble(this.nativeRef, key, value);
        }
        private native DynamicObject native_putDouble(long _nativeRef, String key, double value);

        @Override
        public DynamicObject putData(String key, byte[] value)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_putData(this.nativeRef, key, value);
        }
        private native DynamicObject native_putData(long _nativeRef, String key, byte[] value);

        @Override
        public DynamicObject putBoolean(String key, boolean value)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_putBoolean(this.nativeRef, key, value);
        }
        private native DynamicObject native_putBoolean(long _nativeRef, String key, boolean value);

        @Override
        public DynamicObject putObject(String key, DynamicObject value)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_putObject(this.nativeRef, key, value);
        }
        private native DynamicObject native_putObject(long _nativeRef, String key, DynamicObject value);

        @Override
        public DynamicObject putArray(String key, DynamicArray value)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_putArray(this.nativeRef, key, value);
        }
        private native DynamicObject native_putArray(long _nativeRef, String key, DynamicArray value);

        @Override
        public String getString(String key)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_getString(this.nativeRef, key);
        }
        private native String native_getString(long _nativeRef, String key);

        @Override
        public Integer getInt(String key)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_getInt(this.nativeRef, key);
        }
        private native Integer native_getInt(long _nativeRef, String key);

        @Override
        public Long getLong(String key)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_getLong(this.nativeRef, key);
        }
        private native Long native_getLong(long _nativeRef, String key);

        @Override
        public Double getDouble(String key)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_getDouble(this.nativeRef, key);
        }
        private native Double native_getDouble(long _nativeRef, String key);

        @Override
        public byte[] getData(String key)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_getData(this.nativeRef, key);
        }
        private native byte[] native_getData(long _nativeRef, String key);

        @Override
        public Boolean getBoolean(String key)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_getBoolean(this.nativeRef, key);
        }
        private native Boolean native_getBoolean(long _nativeRef, String key);

        @Override
        public DynamicObject getObject(String key)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_getObject(this.nativeRef, key);
        }
        private native DynamicObject native_getObject(long _nativeRef, String key);

        @Override
        public DynamicArray getArray(String key)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_getArray(this.nativeRef, key);
        }
        private native DynamicArray native_getArray(long _nativeRef, String key);

        @Override
        public boolean contains(String key)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_contains(this.nativeRef, key);
        }
        private native boolean native_contains(long _nativeRef, String key);

        @Override
        public boolean remove(String key)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_remove(this.nativeRef, key);
        }
        private native boolean native_remove(long _nativeRef, String key);

        @Override
        public ArrayList<String> getKeys()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_getKeys(this.nativeRef);
        }
        private native ArrayList<String> native_getKeys(long _nativeRef);

        @Override
        public DynamicType getType(String key)
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_getType(this.nativeRef, key);
        }
        private native DynamicType native_getType(long _nativeRef, String key);

        @Override
        public String dump()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_dump(this.nativeRef);
        }
        private native String native_dump(long _nativeRef);

        @Override
        public byte[] serialize()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_serialize(this.nativeRef);
        }
        private native byte[] native_serialize(long _nativeRef);

        @Override
        public boolean isReadOnly()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_isReadOnly(this.nativeRef);
        }
        private native boolean native_isReadOnly(long _nativeRef);

        @Override
        public long size()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (DynamicObject)");
            }
            return native_size(this.nativeRef);
        }
        private native long native_size(long _nativeRef);
    }
}
