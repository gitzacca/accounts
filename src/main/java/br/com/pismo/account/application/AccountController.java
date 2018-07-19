package br.com.pismo.account.application;

import br.com.pismo.account.domain.Account;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @PostMapping("/v1/accounts")
    public void save() {

    }

    @PatchMapping("/v1/accounts/{id}")
    public void update(@PathVariable Long id, @RequestBody RequestParameter params) {

    }

    @GetMapping("/v1/accounts")
    public List<Account> list() {
        return null;
    }

    @GetMapping("/v1/accounts/{id}")
    public Account findOne(@PathVariable Long id) {
        return null;
    }
}
