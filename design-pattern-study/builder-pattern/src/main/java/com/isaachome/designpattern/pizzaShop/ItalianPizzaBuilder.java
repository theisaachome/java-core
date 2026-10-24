package com.isaachome.designpattern.pizzaShop;

import java.util.ArrayList;
import java.util.List;

public class ItalianPizzaBuilder implements PizzaBuilder{
    private Pizza.PizzaSize size;
    private String crust;
    private List<String> toppings = new ArrayList<>();
    private boolean cheese;
    private String name;
    @Override
    public void setSize(Pizza.PizzaSize size) {
         this.size = size;
    }

    @Override
    public void setCrust(String crust) {
        this.crust = crust;
    }

    @Override
    public void addToppings(String topping) {
        this.toppings.add(topping);
    }

    @Override
    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    @Override
    public void setName(String name) {
         this.name = name;
    }

    @Override
    public Pizza build() {
        return new Pizza(name,size,crust,cheese,toppings);
    }
}
