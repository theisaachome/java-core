package com.isaachome.demo.wallet;

import java.math.BigDecimal;

public class PaypalPayment extends Payment{
    public PaypalPayment(String paymentId, BigDecimal amount, String currency, String date) {
        super(paymentId, amount, currency, date);
    }
    @Override
    public void makePayment() {
        System.out.println("Paypal Payment made");
    }
}
