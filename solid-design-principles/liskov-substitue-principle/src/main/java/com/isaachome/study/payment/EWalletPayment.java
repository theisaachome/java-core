package com.isaachome.study.payment;

public class EWalletPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid RM: " + amount + " using E-Wallet");
    }
}
