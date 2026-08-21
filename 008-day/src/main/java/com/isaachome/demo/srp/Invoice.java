package com.isaachome.demo.srp;

// god class
 class Invoice {
    void calculateInvoice(){
        System.out.println("Calculating invoice");
    }
    void saveToDatabase(){
        System.out.println("Saving invoice to database");
    }
    void printInvoice(){
        System.out.println("Printing invoice");
    }
}
// Single Responsibility Principle

class InvoiceII{
     void calculateInvoice(){
         System.out.println("Calculating invoice");
     }
}
class InvoiceService{
    void saveToDatabase(){
        System.out.println("Saving invoice to database");
    }
}

class PrintInvoiceService{
     void printInvoice(){
         System.out.println("Printing invoice");
     }
}

