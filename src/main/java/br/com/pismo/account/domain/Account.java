package br.com.pismo.account.domain;

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
        this.availableCreditLimit = availableCreditLimit.getAmount();
        this.availableWithdrawalLimit = availableWithdrawalLimit.getAmount();
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAvailableCreditLimit() {
        return availableCreditLimit;
    }

    public BigDecimal getAvailableWithdrawalLimit() {
        return availableWithdrawalLimit;
    }
}
