package com.isaachome.demo.notification;

public interface NotificationChannel extends AuditLoggable{
    void sendNotification(String recipient,String message);

    default  boolean sendWithRetry(String recipient,String message,int maxRetries){
        int attempts = 0;
        while (attempts < maxRetries) {
            try {
                attempts++;
                sendNotification(recipient, message);
                logAudit(recipient, "SUCCESS (Attempt " + attempts + ")");
                return true;
            } catch (Exception e) {
                System.out.println("Attempt " + attempts + " failed: " + e.getMessage());
            }
        }
        logAudit(recipient, "FAILED after " + maxRetries + " attempts");
        return false;
    }
}
