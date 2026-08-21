package com.isaachome.demo.lsp;

 class Eagle implements Animal,Flyable{
     @Override
     public void fly() {
         System.out.println("Eagle is flying high");
     }
 }
