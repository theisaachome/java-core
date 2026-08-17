package com.isaachome.demo.notification;

public class EmailNotificationProvider extends BaseNotificationProvider{
    private final String smtpHost;

    public EmailNotificationProvider(String providerName, boolean isProduction, String smtpHost) {
        super(providerName, isProduction);
        this.smtpHost = smtpHost;
    }

    @Override
    public void sendNotification(String recipient, String message) {
        if (!recipient.contains("@")) {
            throw new IllegalArgumentException("Invalid email address format.");
        }
        System.out.printf("Connecting to SMTP [%s]... Sending Email to %s: '%s'%n",
                smtpHost, recipient, message);
    }
}
