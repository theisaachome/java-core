package com.isaachome.designpattern.simplefactory.store;

public class SimpleFactoryApp {
    static void main() {
        var computer = ProductFactory.createProduct("computer");
        System.out.println(computer);
        System.out.println(ProductFactory.createProduct("phone"));
    }
}
