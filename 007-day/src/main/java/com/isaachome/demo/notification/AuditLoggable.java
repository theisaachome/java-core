package com.isaachome.demo.notification;

import java.time.LocalDateTime;

public interface AuditLoggable {
    default void logAudit(String recipient,String status){
        System.out.printf("[%s] AUDIT LOG -> Sent to: %s | Status: %s%n",
                LocalDateTime.now(), recipient, status);
    }
    // Static interface utility method
    static String sanitizeRecipient(String recipient) {
        return recipient == null ? "UNKNOWN" : recipient.trim().toLowerCase();
    }
}
