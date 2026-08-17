package com.isaachome.demo.wallet;

import java.math.BigDecimal;

public abstract class Payment {
    // All payment types should implement this interface
    // All payments have common information:
    // paymentId
    // 1. Amount
    // 2. Currency
    // 3. Date

    // validate
    // make payment (abstract method)
    // save payment
    // Process payment (where the payment is made)

    private String paymentId;
    private BigDecimal amount;
    private String currency;
    private String date;

    Payment(String paymentId, BigDecimal amount, String currency, String date) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.currency = currency;
        this.date = date;
    }

    private void validate() {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
           throw new IllegalArgumentException("Amount must be positive");
        }
    }

    public abstract void makePayment();
    public void savePayment() {
        System.out.println("Saving payment " + paymentId);
    }
    public void processPayment() {
        validate();
        makePayment();
        savePayment();
    }


}
