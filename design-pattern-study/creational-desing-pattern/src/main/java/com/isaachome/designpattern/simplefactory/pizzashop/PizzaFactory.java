package com.isaachome.designpattern.simplefactory.pizzashop;

public class PizzaFactory {
    private PizzaFactory() {
    }

    public static Pizza getInstanceOf(String pizzaType) {
        if (pizzaType == null) {
            throw new IllegalArgumentException("Pizza type cannot be null");
        }
        return switch (pizzaType) {
            case "pepperoni" -> new PepperoniPizza();
            case "hawaiian" -> new HawaiianPizza();
            default -> throw new IllegalArgumentException("Invalid pizza type");
        };

    }
}
