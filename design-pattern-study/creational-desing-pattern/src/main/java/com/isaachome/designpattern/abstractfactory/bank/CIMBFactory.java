package com.isaachome.designpattern.abstractfactory.bank;

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
