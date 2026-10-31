package com.isaachome.designpattern.abstractpattern.furniture;

// Create Abstract Factory interfaces
// core business logic which creates products (abstract products)
public interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}
