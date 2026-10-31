package com.isaachome.designpattern.abstractpattern.bank;

public class BankingApplication {
    private final PaymentService paymentService;
    private final AccountService accountService;
    private final NotificationService notificationService;

    BankingApplication(BankingFactory factory) {
        this.paymentService = factory.createPayment();
        this.accountService = factory.createAccount();
        this.notificationService = factory.createNotification();
    }

    void execute() {
        accountService.createAccount("Isaac");
        paymentService.pay(5000);
        notificationService.sendNotification("Payment successful");
    }
}
