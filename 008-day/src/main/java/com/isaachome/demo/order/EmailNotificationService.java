package com.isaachome.demo.order;

 class EmailNotificationService implements NotificationService{
     @Override
     public void send() {
         System.out.println("Sending email notification");
     }
 }
