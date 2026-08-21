package com.isaachome.demo.ocp;

 class CreditCardPayment  implements Payment{
     @Override
     public void processPayment() {
         System.out.println("Processing credit card payment");
     }
 }
