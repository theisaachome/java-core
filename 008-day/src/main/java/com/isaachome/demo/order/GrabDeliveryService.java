package com.isaachome.demo.order;

 class GrabDeliveryService implements DeliveryService{
     @Override
     public void deliver() {
         System.out.println("Delivering order using Grab");
     }
 }
