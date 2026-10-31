package com.isaachome.designpattern.abstractpattern.bank;

public class CIMBFactory implements BankingFactory {
    @Override
    public PaymentService createPayment() {
        return new CIMBPayment();
    }

    @Override
    public AccountService createAccount() {
        return new CIMBAccount();
    }

    @Override
    public NotificationService createNotification() {
        return new CIMBNotification();
    }
}
