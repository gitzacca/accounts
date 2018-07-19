package br.com.pismo.account.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.math.BigDecimal;

public class AccountServiceDefaultTest {

    @Mock private AccountRepository accountRepository;
    private AccountServiceDefault service;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        service = new AccountServiceDefault(accountRepository);
    }

    @Test
    public void mustCreateAnAccount() {
        CreditLimit creditLimit = new CreditLimit(new BigDecimal(1000.00));
        WithdrawalLimit withdrawalLimit = new WithdrawalLimit(new BigDecimal(500.00));

        Account account = service.create(creditLimit, withdrawalLimit);

        Mockito.when(accountRepository.save(Mockito.any(Account.class))).then(new Answer<Void>() {

            @Override
            public Void answer(InvocationOnMock invocation) throws Throwable {
                Account accountToBePersisted = (Account) invocation.getArguments()[0];
                Assert.assertNull(accountToBePersisted);
                return null;
            }

        });
    }
}
