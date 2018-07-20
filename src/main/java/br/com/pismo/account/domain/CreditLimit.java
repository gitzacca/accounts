package br.com.pismo.account.domain;

import java.math.BigDecimal;

public class CreditLimit {

    private BigDecimal amount;

    public CreditLimit(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount != null ? amount : new BigDecimal(0);
    }
}
