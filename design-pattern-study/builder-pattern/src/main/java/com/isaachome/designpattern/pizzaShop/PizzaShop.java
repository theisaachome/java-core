package com.isaachome.designpattern.pizzaShop;

public class PizzaShop {
    static void main() {
        var pizzaDirector = new PizzaDirector();

        var pizzaBuilder = new ItalianPizzaBuilder();
        var pepperoniPizza =pizzaDirector.makePepperoni(pizzaBuilder);
        System.out.println(pepperoniPizza);
        var margherita = pizzaDirector.makeMargherita(pizzaBuilder);
        System.out.println(margherita);
    }
}
