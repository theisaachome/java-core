package com.isaachome.designpattern.abstractpattern.bank;

// Factory Interface
// Services in the contract for all factories
interface BankingFactory {
    PaymentService createPayment();

    AccountService createAccount();

    NotificationService createNotification();
}
