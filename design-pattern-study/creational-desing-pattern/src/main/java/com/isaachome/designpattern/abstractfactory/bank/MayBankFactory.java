package com.isaachome.designpattern.abstractfactory.bank;

public class MayBankFactory implements BankingFactory {
    @Override
    public PaymentService createPayment() {
        return new MayBankPayment();
    }

    @Override
    public AccountService createAccount() {
        return new MayBankAccount();
    }

    @Override
    public NotificationService createNotification() {
        return new MayBankNotification();
    }
}
