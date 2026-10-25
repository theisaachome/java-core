package com.isaachome.designpattern.simplefactory.store;

class ProductFactory {

    static Product createProduct(String type) {
        return switch (type) {
            case "phone" -> new Phone();
            case "computer" -> new Computer();
            default -> throw new IllegalArgumentException("Invalid product type");
        };
    }
}
