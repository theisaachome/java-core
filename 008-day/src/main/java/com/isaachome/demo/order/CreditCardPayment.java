package com.isaachome.demo.order;

class CreditCardPayment implements PaymentService{
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }
}
