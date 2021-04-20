// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

package co.ledger.core;

import java.util.ArrayList;

/** Bitcoin network parameters. */
public final class BitcoinLikeNetworkParameters {


    /*package*/ final String Identifier;

    /*package*/ final byte[] P2PKHVersion;

    /*package*/ final byte[] P2SHVersion;

    /*package*/ final byte[] XPUBVersion;

    /*package*/ final BitcoinLikeFeePolicy FeePolicy;

    /*package*/ final long Dust;

    /*package*/ final BitcoinLikeDustPolicy DustPolicy;

    /*package*/ final String MessagePrefix;

    /*package*/ final boolean UsesTimestampedTransaction;

    /*package*/ final long TimestampDelay;

    /*package*/ final byte[] SigHash;

    /*package*/ final ArrayList<String> AdditionalBIPs;

    public BitcoinLikeNetworkParameters(
            String Identifier,
            byte[] P2PKHVersion,
            byte[] P2SHVersion,
            byte[] XPUBVersion,
            BitcoinLikeFeePolicy FeePolicy,
            long Dust,
            BitcoinLikeDustPolicy DustPolicy,
            String MessagePrefix,
            boolean UsesTimestampedTransaction,
            long TimestampDelay,
            byte[] SigHash,
            ArrayList<String> AdditionalBIPs) {
        this.Identifier = Identifier;
        this.P2PKHVersion = P2PKHVersion;
        this.P2SHVersion = P2SHVersion;
        this.XPUBVersion = XPUBVersion;
        this.FeePolicy = FeePolicy;
        this.Dust = Dust;
        this.DustPolicy = DustPolicy;
        this.MessagePrefix = MessagePrefix;
        this.UsesTimestampedTransaction = UsesTimestampedTransaction;
        this.TimestampDelay = TimestampDelay;
        this.SigHash = SigHash;
        this.AdditionalBIPs = AdditionalBIPs;
    }

    /** Name of the network. */
    public String getIdentifier() {
        return Identifier;
    }

    /** Version of the Pay To Public Hash standard. */
    public byte[] getP2PKHVersion() {
        return P2PKHVersion;
    }

    /** Version of the Pay To Script Hash standard. */
    public byte[] getP2SHVersion() {
        return P2SHVersion;
    }

    /** Version of the Extended Public Key standard. */
    public byte[] getXPUBVersion() {
        return XPUBVersion;
    }

    /** Policy to use when expressing fee amount. */
    public BitcoinLikeFeePolicy getFeePolicy() {
        return FeePolicy;
    }

    /** Minimal amount a UTXO should have before being considered BTC dust. */
    public long getDust() {
        return Dust;
    }

    /** Policy to use when expressing dust */
    public BitcoinLikeDustPolicy getDustPolicy() {
        return DustPolicy;
    }

    /** Constant prefix to prepend all signature messages. */
    public String getMessagePrefix() {
        return MessagePrefix;
    }

    /** Are transactions encoded with timestamp? */
    public boolean getUsesTimestampedTransaction() {
        return UsesTimestampedTransaction;
    }

    /** Delay applied to all timestamps. Used to debounce transactions. */
    public long getTimestampDelay() {
        return TimestampDelay;
    }

    /** Bitcoin signature flag indicating what part of a transaction a signature signs. */
    public byte[] getSigHash() {
        return SigHash;
    }

    /** Addition BIPs enabled for this network. */
    public ArrayList<String> getAdditionalBIPs() {
        return AdditionalBIPs;
    }

    @Override
    public String toString() {
        return "BitcoinLikeNetworkParameters{" +
                "Identifier=" + Identifier +
                "," + "P2PKHVersion=" + P2PKHVersion +
                "," + "P2SHVersion=" + P2SHVersion +
                "," + "XPUBVersion=" + XPUBVersion +
                "," + "FeePolicy=" + FeePolicy +
                "," + "Dust=" + Dust +
                "," + "DustPolicy=" + DustPolicy +
                "," + "MessagePrefix=" + MessagePrefix +
                "," + "UsesTimestampedTransaction=" + UsesTimestampedTransaction +
                "," + "TimestampDelay=" + TimestampDelay +
                "," + "SigHash=" + SigHash +
                "," + "AdditionalBIPs=" + AdditionalBIPs +
        "}";
    }

}
