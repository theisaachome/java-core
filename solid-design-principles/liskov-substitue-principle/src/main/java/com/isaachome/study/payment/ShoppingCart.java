package com.isaachome.study.payment;

public class ShoppingCart {
    public void checkout(Payment payment){
        payment.pay(100);
    }
    static void main() {
        var cart = new ShoppingCart();
        var creditCard = new CreditCardPayment();
        var ewallet = new EWalletPayment();

        cart.checkout(creditCard);
        cart.checkout(ewallet);


    }
}
