package com.isaachome.designpattern.abstractfactory.furniture;

import com.isaachome.designpattern.abstractfactory.furniture.product.Chair;
import com.isaachome.designpattern.abstractfactory.furniture.product.CoffeeTable;
import com.isaachome.designpattern.abstractfactory.furniture.product.Sofa;

// Create Abstract Factory interfaces
// core business logic which creates products (abstract products)
public interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}
