package com.isaachome.demo;

public class PaymentProcessor {
    private String merchantId;

    public PaymentProcessor(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public boolean processPayment(double amount){
        System.out.println("Processing payment for "+amount+" using "+merchantId+".");
        return true;
    }
}
