package com.isaachome.demo;

public class CryptoProcessor extends PaymentProcessor{
    private String walletAddress;
    public CryptoProcessor(String walletAddress,String merchantId) {
        super(merchantId);
        this.walletAddress = walletAddress;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("[Crypto] Authorzing $" + amount + " on wallet " + walletAddress + " (Merchant: " + getMerchantId() + " )");
        return true;
    }
}
