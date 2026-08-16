package com.isaachome.demo;

public class CreditCardProcessor extends PaymentProcessor{
    private String creditCardNumber;
    public CreditCardProcessor(String creditCardNumber,String merchantId) {
        super(merchantId);
        this.creditCardNumber = creditCardNumber;
    }

    private String maskCreditCardNumber(String creditCardNumber){
        return "**** **** **** "+creditCardNumber.substring(creditCardNumber.length()-4);
    }
    @Override
    public boolean processPayment(double amount) {
        System.out.println("[Creditcard] Authorzing $" + amount + " on card " + maskCreditCardNumber(creditCardNumber) + " (Merchant: " + getMerchantId() + " )");
        return true;
    }
}
