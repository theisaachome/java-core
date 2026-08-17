package com.isaachome.demo.wallet;

import java.math.BigDecimal;

public class PaymentDemo {
    static void main() {

        var creditcardPayment = new CreditCardPayment("12345", new BigDecimal("100"), "USD", "2023-01-01");
        creditcardPayment.processPayment();

        var paypalPayment = new PaypalPayment("12345", new BigDecimal("100"), "USD", "2023-01-01");
        paypalPayment.processPayment();

        var qrPayment = new QRPayment("12345", new BigDecimal("100"), "USD", "2023-01-01");
        qrPayment.processPayment();
    }
}
