package com.isaachome.demo.notification;

public class SmsNotificationProvider  extends BaseNotificationProvider{
    private final String apiKey;
    public SmsNotificationProvider(String providerName, boolean isProduction, String apiKey) {
        super(providerName, isProduction);
        this.apiKey = apiKey;
    }
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.printf("SMS Gateway [API-KEY: %s...] Sending SMS to %s: '%s'%n",
                apiKey.substring(0, 4), recipient, message);
    }
}
