package com.isaachome.designpattern.abstractfactory.bank;

public class MayBankPayment implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Processing MayBank payment for RM: " + amount);
    }
}
