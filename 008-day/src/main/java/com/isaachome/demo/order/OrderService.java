package com.isaachome.demo.order;


public class OrderService {

    private final PaymentService paymentService;
    private final DeliveryService deliveryService;
    private final NotificationService notificationService;

    public OrderService(PaymentService paymentService, DeliveryService deliveryService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }
    public void processOrder() {
        System.out.println("Order processed");
        paymentService.processPayment();
        notificationService.send();
        deliveryService.deliver();
    }
    public void cancelOrder() {
        System.out.println("Order cancelled");
    }
    public void updateOrder() {
        System.out.println("Order updated");
    }

}
