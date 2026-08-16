package com.isaachome.demo.bank.kpay;


public class BankAccount {
    private String accountNumber;
    private double balance;
    private int pinCode;

    BankAccount(String accountNumber, double balance, int pinCode){
        this.accountNumber=accountNumber;
        this.setPinCode(pinCode);
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    private void setPinCode(int pinCode){
        if(pinCode < 1000 || pinCode > 9999){
            throw new IllegalArgumentException("Invalid pin code");
        }
        this.pinCode=pinCode;
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.balance += amount;
    }

    public boolean withdraw(double amount, int pinCode){
        // wrong pinCode
        if(!validatePinCode(pinCode)){
            return false;
        }
        // zero amount or negative amount
        if(amount <= 0){
            System.out.println("Amount must be positive");
            return false;
        }
        // insufficient funds
        if(amount > this.balance){
            System.out.println("Insufficient funds");
            return false;
        }
        this.balance -= amount;
        return true;
    }

    private boolean validatePinCode(int pinCode){
        if(pinCode != this.pinCode){
            throw new IllegalArgumentException("Invalid pin code");
        }
        return true;
    }
}
