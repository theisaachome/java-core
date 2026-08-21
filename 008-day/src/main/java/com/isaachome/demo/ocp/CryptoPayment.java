package com.isaachome.demo.ocp;

class CryptoPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Processing crypto payment");
    }
}
