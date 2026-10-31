package com.isaachome.designpattern.abstractpattern.furniture;

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
        var furnitureShop = new FurnitureShopApp(factory);
        furnitureShop.displayFurniture();
        
    }
}
