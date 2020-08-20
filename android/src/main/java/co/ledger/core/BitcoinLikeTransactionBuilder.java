// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

package co.ledger.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class BitcoinLikeTransactionBuilder {
    /**
     * Add the given input to the final transaction.
     * @param transactionhash The hash of the transaction in where the UTXO can be located.
     * @params index Index of the UTXO in the previous transaction
     * @params sequence Sequence number to add at the end of the input serialization. This can be used for RBF transaction
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract BitcoinLikeTransactionBuilder addInput(String transactionHash, int index, int sequence);

    /**
     * Add the given output to the final transaction.
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract BitcoinLikeTransactionBuilder addOutput(Amount amount, BitcoinLikeScript script);

    /**
     * If needed the transaction will send its change to the given path. It is possible to add multiple change path.
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract BitcoinLikeTransactionBuilder addChangePath(String path);

    /**
     * Exclude UTXO from the coin selection (alias UTXO picking). You can call this method multiple times to exclude multiple
     * UTXO.
     * @param transactionHash The hash of the transaction in which this UTXO can be found.
     * @param outputIndex The position of the output in the previous transaction,
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract BitcoinLikeTransactionBuilder excludeUtxo(String transactionHash, int outputIndex);

    /**
     * Set the the number of change addresses in the transaction builder.
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract BitcoinLikeTransactionBuilder setNumberOfChangeAddresses(int count);

    /**
     * Set the maximum amount per change output. By default there is no max amount.
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract BitcoinLikeTransactionBuilder setMaxAmountOnChange(Amount amount);

    /**
     * Set the minimum amount per change output. By default this value is the dust value of the currency.
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract BitcoinLikeTransactionBuilder setMinAmountOnChange(Amount amount);

    /**
     * Set the UTXO picking strategy (see [[BitcoinLikePickingStrategy]]).
     * @param strategy The strategy to adopt in order to select which input to use in the transaction.
     * @param sequence The sequence value serialized at the end of the raw transaction. If you don't know what to put here
     * just use 0xFFFFFF
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract BitcoinLikeTransactionBuilder pickInputs(BitcoinLikePickingStrategy strategy, int sequence);

    /**
     * Send funds to the given address. This method can be called multiple times to send to multiple addresses.
     * @param amount The value to send
     * @param address Address of the recipient
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract BitcoinLikeTransactionBuilder sendToAddress(Amount amount, String address);

    /**
     * Send all available funds to the given address.
     * @param address Address of the recipient
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract BitcoinLikeTransactionBuilder wipeToAddress(String address);

    /**
     * Set the amount of fees per byte (of the raw transaction).
     * @return A reference on the same builder in order to chain calls.
     */
    public abstract BitcoinLikeTransactionBuilder setFeesPerByte(Amount fees);

    /** Build a transaction from the given builder parameters. */
    public abstract void build(BitcoinLikeTransactionCallback callback);

    /**
     * Creates a clone of this builder.
     * @return A copy of the current builder instance.
     */
    public abstract BitcoinLikeTransactionBuilder clone();

    /** Reset the current instance to its initial state. */
    public abstract void reset();

    /**
     * Parsing unsigned transaction.
     * parsing a tx might change depending on block height we are on (if an update is effective starting from a given hight)
     */
    public static native BitcoinLikeTransaction parseRawUnsignedTransaction(Currency currency, byte[] rawTransaction, int currentBlockHeight);

    private static final class CppProxy extends BitcoinLikeTransactionBuilder
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
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
        public BitcoinLikeTransactionBuilder addInput(String transactionHash, int index, int sequence)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_addInput(this.nativeRef, transactionHash, index, sequence);
        }
        private native BitcoinLikeTransactionBuilder native_addInput(long _nativeRef, String transactionHash, int index, int sequence);

        @Override
        public BitcoinLikeTransactionBuilder addOutput(Amount amount, BitcoinLikeScript script)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_addOutput(this.nativeRef, amount, script);
        }
        private native BitcoinLikeTransactionBuilder native_addOutput(long _nativeRef, Amount amount, BitcoinLikeScript script);

        @Override
        public BitcoinLikeTransactionBuilder addChangePath(String path)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_addChangePath(this.nativeRef, path);
        }
        private native BitcoinLikeTransactionBuilder native_addChangePath(long _nativeRef, String path);

        @Override
        public BitcoinLikeTransactionBuilder excludeUtxo(String transactionHash, int outputIndex)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_excludeUtxo(this.nativeRef, transactionHash, outputIndex);
        }
        private native BitcoinLikeTransactionBuilder native_excludeUtxo(long _nativeRef, String transactionHash, int outputIndex);

        @Override
        public BitcoinLikeTransactionBuilder setNumberOfChangeAddresses(int count)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setNumberOfChangeAddresses(this.nativeRef, count);
        }
        private native BitcoinLikeTransactionBuilder native_setNumberOfChangeAddresses(long _nativeRef, int count);

        @Override
        public BitcoinLikeTransactionBuilder setMaxAmountOnChange(Amount amount)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setMaxAmountOnChange(this.nativeRef, amount);
        }
        private native BitcoinLikeTransactionBuilder native_setMaxAmountOnChange(long _nativeRef, Amount amount);

        @Override
        public BitcoinLikeTransactionBuilder setMinAmountOnChange(Amount amount)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setMinAmountOnChange(this.nativeRef, amount);
        }
        private native BitcoinLikeTransactionBuilder native_setMinAmountOnChange(long _nativeRef, Amount amount);

        @Override
        public BitcoinLikeTransactionBuilder pickInputs(BitcoinLikePickingStrategy strategy, int sequence)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_pickInputs(this.nativeRef, strategy, sequence);
        }
        private native BitcoinLikeTransactionBuilder native_pickInputs(long _nativeRef, BitcoinLikePickingStrategy strategy, int sequence);

        @Override
        public BitcoinLikeTransactionBuilder sendToAddress(Amount amount, String address)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_sendToAddress(this.nativeRef, amount, address);
        }
        private native BitcoinLikeTransactionBuilder native_sendToAddress(long _nativeRef, Amount amount, String address);

        @Override
        public BitcoinLikeTransactionBuilder wipeToAddress(String address)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_wipeToAddress(this.nativeRef, address);
        }
        private native BitcoinLikeTransactionBuilder native_wipeToAddress(long _nativeRef, String address);

        @Override
        public BitcoinLikeTransactionBuilder setFeesPerByte(Amount fees)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setFeesPerByte(this.nativeRef, fees);
        }
        private native BitcoinLikeTransactionBuilder native_setFeesPerByte(long _nativeRef, Amount fees);

        @Override
        public void build(BitcoinLikeTransactionCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_build(this.nativeRef, callback);
        }
        private native void native_build(long _nativeRef, BitcoinLikeTransactionCallback callback);

        @Override
        public BitcoinLikeTransactionBuilder clone()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_clone(this.nativeRef);
        }
        private native BitcoinLikeTransactionBuilder native_clone(long _nativeRef);

        @Override
        public void reset()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_reset(this.nativeRef);
        }
        private native void native_reset(long _nativeRef);
    }
}
