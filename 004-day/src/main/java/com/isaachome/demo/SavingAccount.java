package com.isaachome.demo;

public class SavingAccount {
    private String accountNumber;
    private long balanceInCents;
    private static int totalAccountsCreated = 0;


    public SavingAccount(String accountNumber, long balanceInCents) {
        this.accountNumber = accountNumber;
        this.balanceInCents = balanceInCents;
        totalAccountsCreated++;
    }

    public static int getTotalAccountsCreated() {
        return totalAccountsCreated;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public long getBalanceInCents() {
        return balanceInCents;
    }

    public void deposit(long amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.balanceInCents += amount;
    }
    public void withdraw(long amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be positive");
        }
        if(amount > this.balanceInCents){
            throw new IllegalArgumentException("Insufficient funds");
        }
        this.balanceInCents -= amount;
    }
    public void transfer(long amount, SavingAccount target){
        withdraw(amount);
        target.deposit(amount);
    }
}
