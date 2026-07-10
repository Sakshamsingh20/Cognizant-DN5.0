package com.cognizant.week4.microservices.accountservice;

public class Account {
    private int accountId;
    private String accountHolderName;
    private String accountType;
    private double balance;

    public Account() {}

    public Account(int accountId, String accountHolderName, String accountType, double balance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountId() { return accountId; }
    public String getAccountHolderName() { return accountHolderName; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }

    public void setAccountId(int accountId) { this.accountId = accountId; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }
    public void setAccountType(String accountType) { this.accountType = accountType; }
    public void setBalance(double balance) { this.balance = balance; }
}