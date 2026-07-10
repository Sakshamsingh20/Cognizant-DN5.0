package com.cognizant.week4.microservices.accountservice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private List<Account> accountList = new ArrayList<>();

    public AccountController() {
        accountList.add(new Account(1, "Saksham Singh", "Savings", 50000.0));
        accountList.add(new Account(2, "Rahul Sharma", "Current", 100000.0));
        accountList.add(new Account(3, "Priya Patel", "Savings", 75000.0));
    }

    // Get all accounts
    @GetMapping
    public List<Account> getAllAccounts() {
        return accountList;
    }

    // Get account by ID
    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable int id) {
        for (Account a : accountList) {
            if (a.getAccountId() == id) {
                return a;
            }
        }
        return null;
    }

    // Add new account
    @PostMapping
    public String addAccount(@RequestBody Account account) {
        accountList.add(account);
        return "Account created successfully!";
    }
}