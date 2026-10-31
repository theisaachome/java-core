package com.isaachome.designpattern.abstractpattern.bank;

public class CIMBPayment implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Processing CIMB payment for RM: " + amount);
    }
}
