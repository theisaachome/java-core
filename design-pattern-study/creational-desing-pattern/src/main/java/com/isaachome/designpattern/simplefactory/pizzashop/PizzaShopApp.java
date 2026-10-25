package com.isaachome.designpattern.simplefactory.pizzashop;

public class PizzaShopApp {
    static void main() {
        var pizza = PizzaFactory.getInstanceOf("hawaiian");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza);

        var pepperoni = PizzaFactory.getInstanceOf("pepperoni");
        pepperoni.prepare();
        pepperoni.bake();
        pepperoni.cut();
        pepperoni.box();
        System.out.println(pepperoni);
        
    }
}
