package com.isaachome.demo.notification;

public abstract class BaseNotificationProvider implements NotificationChannel{
    private final String providerName;
    private final boolean isProductionMode;

    public BaseNotificationProvider(String providerName, boolean isProductionMode) {
        this.providerName = providerName;
        this.isProductionMode = isProductionMode;
    }

    // Concrete method shared by all subclasses
    public void printHeader() {
        System.out.printf("--- Provider: %s [Mode: %s] ---%n",
                providerName, isProductionMode ? "PROD" : "SANDBOX");
    }

    // Template method defining execution flow
    public final void dispatch(String recipient, String message) {
        printHeader();
        String cleanRecipient = AuditLoggable.sanitizeRecipient(recipient);
        sendWithRetry(cleanRecipient, message, 2);
    }

    public String getProviderName() {
        return providerName;
    }

    public boolean isProductionMode() {
        return isProductionMode;
    }

}
