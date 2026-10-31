package com.isaachome.designpattern.abstractpattern.furniture.modern;

import com.isaachome.designpattern.abstractpattern.furniture.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems() {
        System.out.println("Placing items on a Modern Coffee Table");
    }
}
