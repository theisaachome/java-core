package com.isaachome.designpattern.pizzaShop;

import java.util.List;



// Product
public class Pizza {
    private final String name;
    private final PizzaSize size;
    private final String crust;
    private final boolean cheese;
    private final List<String> toppings;

    public enum PizzaSize {
        SMALL, MEDIUM, LARGE
    }

    public Pizza(String name, PizzaSize size, String crust, boolean cheese, List<String> toppings) {
        this.name = name;
        this.size = size;
        this.crust = crust;
        this.cheese = cheese;
        this.toppings = List.copyOf(toppings);
    }

    public String getName() {
        return name;
    }

    public PizzaSize getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public boolean isCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", crust='" + crust + '\'' +
                ", cheese=" + cheese +
                ", toppings=" + toppings +
                '}';
    }
}
