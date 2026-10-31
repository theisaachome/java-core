package com.isaachome.designpattern.abstractpattern.bank;

public class MayBankPayment implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Processing MayBank payment for RM: " + amount);
    }
}
