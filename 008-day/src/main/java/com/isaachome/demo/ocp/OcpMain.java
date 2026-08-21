package com.isaachome.demo.ocp;

public class OcpMain {
    static void main() {
        Payment payment = new CreditCardPayment();
        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(payment);
        checkoutService.checkout(new CryptoPayment());
    }
}
