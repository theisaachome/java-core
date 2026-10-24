package com.isaachome.designpattern.pizzaShop;

interface PizzaBuilder {
    void setSize(Pizza.PizzaSize size);
    void setCrust(String crust);
    void addToppings(String topping);
    void setCheese(boolean cheese);
    void setName(String name);
    Pizza build();
}
