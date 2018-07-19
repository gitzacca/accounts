package br.com.pismo.account.application;

import br.com.pismo.account.domain.CreditLimit;
import br.com.pismo.account.domain.WithdrawalLimit;

public class RequestParameter {

    private CreditLimit availableCreditLimit;
    private WithdrawalLimit availableWithdrawalLimit;

    public RequestParameter(CreditLimit availableCreditLimit, WithdrawalLimit availableWithdrawalLimit) {
        this.availableCreditLimit = availableCreditLimit;
        this.availableWithdrawalLimit = availableWithdrawalLimit;
    }

    public CreditLimit getAvailableCreditLimit() {
        return availableCreditLimit;
    }

    public WithdrawalLimit getAvailableWithdrawalLimit() {
        return availableWithdrawalLimit;
    }
}
