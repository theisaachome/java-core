package com.isaachome.study.payment;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid RM: " + amount + " using Credit Card");
    }
}
