package com.isaachome.demo.wallet;

import java.math.BigDecimal;

public class CreditCardPayment extends Payment{

    public CreditCardPayment(String paymentId, BigDecimal amount, String currency, String date) {
        super(paymentId, amount, currency, date);
    }

    @Override
    public void makePayment() {
        System.out.println("Credit card payment made.");
    }
}
