// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from currency.djinni

package co.ledger.core;

import java.util.ArrayList;

/**Structure of cryptocurrency */
public final class Currency {


    /*package*/ final WalletType walletType;

    /*package*/ final String name;

    /*package*/ final int bip44CoinType;

    /*package*/ final String paymentUriScheme;

    /*package*/ final ArrayList<CurrencyUnit> units;

    /*package*/ final BitcoinLikeNetworkParameters bitcoinLikeNetworkParameters;

    public Currency(
            WalletType walletType,
            String name,
            int bip44CoinType,
            String paymentUriScheme,
            ArrayList<CurrencyUnit> units,
            BitcoinLikeNetworkParameters bitcoinLikeNetworkParameters) {
        this.walletType = walletType;
        this.name = name;
        this.bip44CoinType = bip44CoinType;
        this.paymentUriScheme = paymentUriScheme;
        this.units = units;
        this.bitcoinLikeNetworkParameters = bitcoinLikeNetworkParameters;
    }

    /**WalletType object defining the type of wallet the currency belongs to */
    public WalletType getWalletType() {
        return walletType;
    }

    /**String which represents currency name */
    public String getName() {
        return name;
    }

    /**
     *Integer cointype, part of BIP32 path
     *One can refer to https://github.com/satoshilabs/slips/blob/master/slip-0044.md
     */
    public int getBip44CoinType() {
        return bip44CoinType;
    }

    /**String representing schemes allowing to send money to a cryptocurrency address (e.g. bitcoin) */
    public String getPaymentUriScheme() {
        return paymentUriScheme;
    }

    /**List of CurrencyUnit objects (e.g. BTC, mBTC ...) */
    public ArrayList<CurrencyUnit> getUnits() {
        return units;
    }

    /**Optional BitcoinLikeNetworkParameters, for more details refer to BitcoinLikeNetworkParameters doc */
    public BitcoinLikeNetworkParameters getBitcoinLikeNetworkParameters() {
        return bitcoinLikeNetworkParameters;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "walletType=" + walletType +
                "," + "name=" + name +
                "," + "bip44CoinType=" + bip44CoinType +
                "," + "paymentUriScheme=" + paymentUriScheme +
                "," + "units=" + units +
                "," + "bitcoinLikeNetworkParameters=" + bitcoinLikeNetworkParameters +
        "}";
    }

}
