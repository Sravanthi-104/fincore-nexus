package com.infosys.finbank.account.controller;

import com.infosys.finbank.account.model.Account;
import com.infosys.finbank.account.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/account")
@CrossOrigin("*")
public class AccountController {

    @Autowired
    AccountService service;

    // Add Account
    @PostMapping("/add")
    public Account addAccount(@RequestBody Account account)
    {
        return service.addAccount(account);
    }

    // View All Accounts
    @GetMapping("/all")
    public Iterable<Account> getAllAccounts()
    {
        return service.getAllAccounts();
    }

    // View Account By Id
    @GetMapping("/{id}")
    public Account getAccount(@PathVariable Integer id)
    {
        return service.getAccount(id);
    }

    // Update Account
    @PutMapping("/update")
    public Account updateAccount(@RequestBody Account account)
    {
        return service.updateAccount(account);
    }

    // Delete Account
    @DeleteMapping("/delete/{id}")
    public String deleteAccount(@PathVariable Integer id)
    {
        return service.deleteAccount(id);
    }

    // Deposit
    @PutMapping("/deposit/{id}/{amount}")
    public Account deposit(@PathVariable Integer id,
                           @PathVariable Double amount)
    {
        return service.deposit(id, amount);
    }

    // Withdraw
    @PutMapping("/withdraw/{id}/{amount}")
    public Account withdraw(@PathVariable Integer id,
                            @PathVariable Double amount)
    {
        return service.withdraw(id, amount);
    }

    // Balance Enquiry
    @GetMapping("/balance/{id}")
    public Double getBalance(@PathVariable Integer id)
    {
        return service.getBalance(id);
    }

}