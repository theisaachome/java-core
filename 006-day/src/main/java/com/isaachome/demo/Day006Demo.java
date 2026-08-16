package com.isaachome.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Day006Demo
{
     static void main( String[] args )
    {
        var paymentProcess = new CreditCardProcessor("12324738927839275","99889900");
        paymentProcess.processPayment(1000);

        var paypalProcess = new PaypalProcessor("johndoe@gmail.com","99889900");
        paypalProcess.processPayment(1000);

        var cryptoProcess = new CryptoProcessor("12324738927839275","99889900");
        cryptoProcess.processPayment(1000);

        // Polymorphic Collection: Superclass references holding subclass instances
        List<PaymentProcessor> checkoutQueue = new ArrayList<>();

        checkoutQueue.add(new CreditCardProcessor("MCH-101", "4111111111111234"));
        checkoutQueue.add(new CryptoProcessor("MCH-102", "0x71C...39A"));
        checkoutQueue.add(new PaypalProcessor("MCH-103", "user@example.com"));

        System.out.println("=== Executing Payments via Dynamic Dispatch ===");

        // Loop uses Superclass type (PaymentProcessor)
        for (PaymentProcessor processor : checkoutQueue) {
            // DYNAMIC DISPATCH AT WORK:
            // At compile-time, Java only knows processor.processPayment() exists on PaymentProcessor.
            // At runtime, JVM determines actual class type and invokes the correct overridden method.
            processor.processPayment(150.00);
        }
    }
}
