package com.isaachome.designpattern.abstractfactory.bank;

public class MayBankNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Maybank notification: " + message);
    }
}
