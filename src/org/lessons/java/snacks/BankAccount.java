package org.lessons.java.snacks;

public class BankAccount {
    private long accountNumber;
    private double accountBalance;

    // constructor
    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdraw(double amount) {
        accountBalance -= amount;
    }


    public double getBalance() {
        return accountBalance;
    }
    
}
