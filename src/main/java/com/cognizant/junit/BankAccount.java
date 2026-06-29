package com.cognizant.junit;

public class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new IllegalArgumentException("Not Enough Balance");
		}
		balance -= amount;
		
	}
	public double getBalance() {
		return balance;
	}

}
