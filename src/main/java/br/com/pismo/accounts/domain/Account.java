package br.com.pismo.accounts.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private BigDecimal availableCreditLimit;

    @Column(nullable = false)
    private BigDecimal availableWithdrawalLimit;

    public Account(CreditLimit availableCreditLimit, WithdrawalLimit availableWithdrawalLimit) {
        this.availableCreditLimit = availableCreditLimit != null ? availableCreditLimit.getAmount() : new BigDecimal(0) ;
        this.availableWithdrawalLimit = availableWithdrawalLimit != null ? availableWithdrawalLimit.getAmount() : new BigDecimal(0);
    }

    protected Account() {}

    public Long getId() {
        return id;
    }

    public BigDecimal getAvailableCreditLimit() {
        return availableCreditLimit;
    }

    public BigDecimal getAvailableWithdrawalLimit() {
        return availableWithdrawalLimit;
    }

    void addAvailableCreditLimit(CreditLimit creditLimit) {
        if (creditLimit != null) {
            this.availableCreditLimit = availableCreditLimit.add(creditLimit.getAmount());
        }
    }

    void addAvailableWithdrawalLimit(WithdrawalLimit withdrawalLimit) {
        if (withdrawalLimit != null) {
            this.availableWithdrawalLimit = availableWithdrawalLimit.add(withdrawalLimit.getAmount());
        }
    }
}
