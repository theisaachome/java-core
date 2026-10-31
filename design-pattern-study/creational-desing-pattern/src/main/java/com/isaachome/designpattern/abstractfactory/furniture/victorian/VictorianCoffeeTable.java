package com.isaachome.designpattern.abstractfactory.furniture.victorian;

import com.isaachome.designpattern.abstractfactory.furniture.product.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems() {
        System.out.println("Placing items on a Victorian Coffee Table");
    }
}
