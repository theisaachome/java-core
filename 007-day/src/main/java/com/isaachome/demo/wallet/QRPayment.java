package com.isaachome.demo.wallet;

import java.math.BigDecimal;

public class QRPayment extends Payment{

    public QRPayment(String paymentId, BigDecimal amount, String currency, String date) {
        super(paymentId, amount, currency, date);
    }

    @Override
    public void makePayment() {
        System.out.println("QR Payment made for %s");
    }
}
