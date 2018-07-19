package br.com.pismo.account.domain;

import java.util.List;

public interface AccountService {

    Account create(CreditLimit creditLimit, WithdrawalLimit withdrawalLimit);

    void changeLimits(Long id, CreditLimit creditLimit, WithdrawalLimit withdrawalLimit);

    List<Account> findAll();

    Account findBy(Long id);

}
