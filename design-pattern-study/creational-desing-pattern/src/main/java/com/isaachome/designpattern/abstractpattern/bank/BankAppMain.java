package com.isaachome.designpattern.abstractpattern.bank;

public class BankAppMain {
    static void main() {
        // select bank factory
        BankingFactory bankFactory = new MayBankFactory();

        // Inject factory into application
        var application = new BankingApplication(bankFactory);
        application.execute();
    }
}
