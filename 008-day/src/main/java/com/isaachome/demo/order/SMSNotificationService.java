package com.isaachome.demo.order;

 class SMSNotificationService implements NotificationService{
     @Override
     public void send() {
         System.out.println("Sending SMS notification");
     }
 }
