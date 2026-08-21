package com.isaachome.demo.order;

 class OrderAppMain {
    static void main() {
        var todayOrder =new OrderService(new CreditCardPayment(),new GrabDeliveryService(),new EmailNotificationService());
        todayOrder.processOrder();
    }
}
