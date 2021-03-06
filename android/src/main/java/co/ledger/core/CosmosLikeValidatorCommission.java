// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from validators.djinni

package co.ledger.core;

import java.util.Date;

/** Commission data for a Validator */
public final class CosmosLikeValidatorCommission {


    /*package*/ final CosmosLikeCommissionRates rates;

    /*package*/ final Date updateTime;

    public CosmosLikeValidatorCommission(
            CosmosLikeCommissionRates rates,
            Date updateTime) {
        this.rates = rates;
        this.updateTime = updateTime;
    }

    public CosmosLikeCommissionRates getRates() {
        return rates;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public String toString() {
        return "CosmosLikeValidatorCommission{" +
                "rates=" + rates +
                "," + "updateTime=" + updateTime +
        "}";
    }

}
