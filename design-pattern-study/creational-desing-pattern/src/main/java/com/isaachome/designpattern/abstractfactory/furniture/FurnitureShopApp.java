package com.isaachome.designpattern.abstractfactory.furniture;

import com.isaachome.designpattern.abstractfactory.furniture.product.Chair;
import com.isaachome.designpattern.abstractfactory.furniture.product.CoffeeTable;
import com.isaachome.designpattern.abstractfactory.furniture.product.Sofa;

public class FurnitureShopApp {
    private final Chair chair;
    private final Sofa sofa;
    private final CoffeeTable coffeeTable;

    public FurnitureShopApp(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.coffeeTable = factory.createCoffeeTable();
    }

    public void displayFurniture() {
        chair.sitOn();
        sofa.lieOn();
        coffeeTable.placeItems();
    }

    static void main() {
        // Setup Factory
        FurnitureFactory factory = new ModerFurnitureFactory();
        FurnitureFactory factory02 = new VictorianFurnitureFactory();


        var furnitureShop = new FurnitureShopApp(factory);
        var furnitureShop02 = new FurnitureShopApp(factory02);
        furnitureShop.displayFurniture();
        System.out.println("-------------&---------------");
        furnitureShop02.displayFurniture();

    }
}
