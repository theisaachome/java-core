package com.isaachome.designpattern.pizzaShop;

public class PizzaDirector {
    public Pizza makeMargherita(PizzaBuilder builder){
        builder.setSize(Pizza.PizzaSize.MEDIUM);
        builder.setCrust("Thin");
        builder.addToppings("Mozzarella");
        builder.setName("Margherita");
        builder.addToppings("Tomato");
        builder.addToppings("Basil");
        builder.setCheese(true);
        return builder.build();
    }

    public Pizza makePepperoni(PizzaBuilder builder){
        builder.setSize(Pizza.PizzaSize.LARGE);
        builder.setCrust("Thick");
        builder.addToppings("Pepperoni");
        builder.setName("Pepperoni");
        builder.setCheese(true);
        builder.addToppings("Olives");
        builder.addToppings("Onions");
        return builder.build();
    }
}
