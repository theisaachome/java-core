package com.isaachome.demo.srp;

 class Order {
     protected void createOrder(){
         System.out.println("Creating order");
     }
     protected void processOrder(){
        System.out.println("Processing order");
     }
     protected void processPayment(){
        System.out.println("Processing payment");
     }
     protected void sendEmail() {
         System.out.println("Sending email");
     }
     protected void shipOrder(){
        System.out.println("Shipping order");
     }
}
