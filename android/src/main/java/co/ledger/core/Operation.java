// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package co.ledger.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

/** Class representing an operation. */
public abstract class Operation {
    /**
     * Get id's operation.
     * @return string
     */
    public abstract String getUid();

    /**
     * Get account's index in user's wallet.
     * @return 32-bit integer
     */
    public abstract int getAccountIndex();

    /**
     * Get type of operation.
     * @return OperationType object (for more details refer to OperationType)
     */
    public abstract OperationType getOperationType();

    /**
     * Return date on which operation was issued.
     * @return date object
     */
    public abstract Date getDate();

    /**
     * Get senders of operation.
     * @return List of string, list of all senders
     */
    public abstract ArrayList<String> getSenders();

    /**
     * Get recipients of operation.
     * @return List of string, list of all recipients
     */
    public abstract ArrayList<String> getRecipients();

    /**
     * Get account-filtered recipients list associated with the operation.
     *
     * This function will filter recipients to retain only the ones that are owned by the current
     * account.
     */
    public abstract ArrayList<String> getSelfRecipients();

    /**
     * Get amount of operation.
     * @return Amount object
     */
    public abstract Amount getAmount();

    /**
     * Get fees of operation.
     * @return Optional Amount object
     */
    public abstract Amount getFees();

    /**
     * Get preferences of operation.
     * @return Prefences object
     */
    public abstract Preferences getPreferences();

    /**
     * Get trust indicator of operation.
     * @return TrustIndicator object
     */
    public abstract TrustIndicator getTrust();

    /**
     * Get block height on which operation was included.
     * @return Optional 64-bit integer, height of block in which operation was validated
     */
    public abstract Long getBlockHeight();

    /**
     * Convert operation as Bitcoin operation.
     * @return BitcoinLikeOperation object
     */
    public abstract BitcoinLikeOperation asBitcoinLikeOperation();

    /**
     * Convert operation as Cosmos operation.
     * @return CosmosLikeOperation object
     */
    public abstract CosmosLikeOperation asCosmosLikeOperation();

    /**
     * Convert operation as Ethereum operation.
     * @return EthereumLikeOperation object
     */
    public abstract EthereumLikeOperation asEthereumLikeOperation();

    /**
     *Convert operation as Ripple operation
     *@return RippleLikeOperation object
     */
    public abstract RippleLikeOperation asRippleLikeOperation();

    /**
     *Convert operation as Tezos operation
     *@return TezosLikeOperation object
     */
    public abstract TezosLikeOperation asTezosLikeOperation();

    /**
     * Same as isInstanceOfBitcoinLikeOperation for bitcoin.
     * Convert operation as Stellar operation.
     * @return StellarLikeOperation object
     */
    public abstract StellarLikeOperation asStellarLikeOperation();

    /**
     * Same as isInstanceOfBitcoinLikeOperation for bitcoin.
     * Convert operation as Algorand operation.
     * @return AlgorandOperation object
     */
    public abstract AlgorandOperation asAlgorandOperation();

    /** Is this an instance of a Bitcoin-like operation? */
    public abstract boolean isInstanceOfBitcoinLikeOperation();

    /** Same as isInstanceOfCosmosLikeOperation for cosmos. */
    public abstract boolean isInstanceOfCosmosLikeOperation();

    /** Same as isInstanceOfEthereumLikeOperation for ethereum. */
    public abstract boolean isInstanceOfEthereumLikeOperation();

    /** Same as isInstanceOfRippleLikeOperation for ripple. */
    public abstract boolean isInstanceOfRippleLikeOperation();

    /** Same as isInstanceOfTezosLikeOperation for tezos. */
    public abstract boolean isInstanceOfTezosLikeOperation();

    /** Same as isInstanceOfBitcoinLikeOperation for ripple. */
    public abstract boolean isInstanceOfStellarLikeOperation();

    /**
     * Tells if the operation is complete.
     * @return boolean
     */
    public abstract boolean isComplete();

    /**
     * Get type of wallet from which operation was issued.
     * @return WalletType object
     */
    public abstract WalletType getWalletType();

    /** Get the currency this operation is about. */
    public abstract Currency getCurrency();
    /** Release the underlying native object */
    public abstract void destroy();


    private static final class CppProxy extends Operation
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
        public String getUid()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getUid(this.nativeRef);
        }
        private native String native_getUid(long _nativeRef);

        @Override
        public int getAccountIndex()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getAccountIndex(this.nativeRef);
        }
        private native int native_getAccountIndex(long _nativeRef);

        @Override
        public OperationType getOperationType()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getOperationType(this.nativeRef);
        }
        private native OperationType native_getOperationType(long _nativeRef);

        @Override
        public Date getDate()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getDate(this.nativeRef);
        }
        private native Date native_getDate(long _nativeRef);

        @Override
        public ArrayList<String> getSenders()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getSenders(this.nativeRef);
        }
        private native ArrayList<String> native_getSenders(long _nativeRef);

        @Override
        public ArrayList<String> getRecipients()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getRecipients(this.nativeRef);
        }
        private native ArrayList<String> native_getRecipients(long _nativeRef);

        @Override
        public ArrayList<String> getSelfRecipients()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getSelfRecipients(this.nativeRef);
        }
        private native ArrayList<String> native_getSelfRecipients(long _nativeRef);

        @Override
        public Amount getAmount()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getAmount(this.nativeRef);
        }
        private native Amount native_getAmount(long _nativeRef);

        @Override
        public Amount getFees()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getFees(this.nativeRef);
        }
        private native Amount native_getFees(long _nativeRef);

        @Override
        public Preferences getPreferences()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getPreferences(this.nativeRef);
        }
        private native Preferences native_getPreferences(long _nativeRef);

        @Override
        public TrustIndicator getTrust()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getTrust(this.nativeRef);
        }
        private native TrustIndicator native_getTrust(long _nativeRef);

        @Override
        public Long getBlockHeight()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getBlockHeight(this.nativeRef);
        }
        private native Long native_getBlockHeight(long _nativeRef);

        @Override
        public BitcoinLikeOperation asBitcoinLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_asBitcoinLikeOperation(this.nativeRef);
        }
        private native BitcoinLikeOperation native_asBitcoinLikeOperation(long _nativeRef);

        @Override
        public CosmosLikeOperation asCosmosLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_asCosmosLikeOperation(this.nativeRef);
        }
        private native CosmosLikeOperation native_asCosmosLikeOperation(long _nativeRef);

        @Override
        public EthereumLikeOperation asEthereumLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_asEthereumLikeOperation(this.nativeRef);
        }
        private native EthereumLikeOperation native_asEthereumLikeOperation(long _nativeRef);

        @Override
        public RippleLikeOperation asRippleLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_asRippleLikeOperation(this.nativeRef);
        }
        private native RippleLikeOperation native_asRippleLikeOperation(long _nativeRef);

        @Override
        public TezosLikeOperation asTezosLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_asTezosLikeOperation(this.nativeRef);
        }
        private native TezosLikeOperation native_asTezosLikeOperation(long _nativeRef);

        @Override
        public StellarLikeOperation asStellarLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_asStellarLikeOperation(this.nativeRef);
        }
        private native StellarLikeOperation native_asStellarLikeOperation(long _nativeRef);

        @Override
        public AlgorandOperation asAlgorandOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_asAlgorandOperation(this.nativeRef);
        }
        private native AlgorandOperation native_asAlgorandOperation(long _nativeRef);

        @Override
        public boolean isInstanceOfBitcoinLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_isInstanceOfBitcoinLikeOperation(this.nativeRef);
        }
        private native boolean native_isInstanceOfBitcoinLikeOperation(long _nativeRef);

        @Override
        public boolean isInstanceOfCosmosLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_isInstanceOfCosmosLikeOperation(this.nativeRef);
        }
        private native boolean native_isInstanceOfCosmosLikeOperation(long _nativeRef);

        @Override
        public boolean isInstanceOfEthereumLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_isInstanceOfEthereumLikeOperation(this.nativeRef);
        }
        private native boolean native_isInstanceOfEthereumLikeOperation(long _nativeRef);

        @Override
        public boolean isInstanceOfRippleLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_isInstanceOfRippleLikeOperation(this.nativeRef);
        }
        private native boolean native_isInstanceOfRippleLikeOperation(long _nativeRef);

        @Override
        public boolean isInstanceOfTezosLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_isInstanceOfTezosLikeOperation(this.nativeRef);
        }
        private native boolean native_isInstanceOfTezosLikeOperation(long _nativeRef);

        @Override
        public boolean isInstanceOfStellarLikeOperation()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_isInstanceOfStellarLikeOperation(this.nativeRef);
        }
        private native boolean native_isInstanceOfStellarLikeOperation(long _nativeRef);

        @Override
        public boolean isComplete()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_isComplete(this.nativeRef);
        }
        private native boolean native_isComplete(long _nativeRef);

        @Override
        public WalletType getWalletType()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getWalletType(this.nativeRef);
        }
        private native WalletType native_getWalletType(long _nativeRef);

        @Override
        public Currency getCurrency()
        {
            if (this.destroyed.get())
            {
                throw new RuntimeException("trying to use a destroyed object (Operation)");
            }
            return native_getCurrency(this.nativeRef);
        }
        private native Currency native_getCurrency(long _nativeRef);
    }
}
