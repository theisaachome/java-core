package com.isaachome.demo.notification;

public class NotificationDemo {
    static void main() {
        NotificationChannel emailChannel = new EmailNotificationProvider(
                "SendGrid", false, "smtp.sendgrid.net");

        BaseNotificationProvider smsChannel = new SmsNotificationProvider(
                "Twilio", true, "TWILIO_SECRET_KEY_9988");

        System.out.println("=== 1. Dispatching Email (With retry success) ===");
        emailChannel.sendNotification("ALICE@EXAMPLE.COM", "Your order #1001 has shipped!");

        System.out.println("\n=== 2. Dispatching SMS via Template Pipeline ===");
        smsChannel.dispatch(" +1-555-0192 ", "Your security code is: 482019");

        System.out.println("\n=== 3. Testing Failure & Retry Logic ===");
        emailChannel.sendWithRetry("invalid-email-address", "Test Retry Flow", 2);

    }
}
