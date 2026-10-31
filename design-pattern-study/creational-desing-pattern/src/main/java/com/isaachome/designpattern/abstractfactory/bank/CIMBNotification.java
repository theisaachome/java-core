package com.isaachome.designpattern.abstractfactory.bank;

public class CIMBNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("CIMB Notification: " + message);
    }
}
