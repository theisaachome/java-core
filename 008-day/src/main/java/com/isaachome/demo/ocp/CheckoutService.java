package com.isaachome.demo.ocp;

 class CheckoutService {
     protected void checkout(Payment payment){
         System.out.println("Processing checkout");
        payment.processPayment();
     }
}
