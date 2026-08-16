package com.isaachome.demo;

public class PaypalProcessor extends PaymentProcessor{
    private String email;
    public PaypalProcessor(String email,String merchantId) {
        super(merchantId);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("[Paypal] Authorzing $" + amount + " on email " + email + " (Merchant: " + getMerchantId() + " )");
        return true;
    }
}
