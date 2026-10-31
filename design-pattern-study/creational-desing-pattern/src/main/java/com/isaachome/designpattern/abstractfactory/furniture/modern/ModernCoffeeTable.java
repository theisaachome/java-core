package com.isaachome.designpattern.abstractfactory.furniture.modern;

import com.isaachome.designpattern.abstractfactory.furniture.product.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems() {
        System.out.println("Placing items on a Modern Coffee Table");
    }
}
