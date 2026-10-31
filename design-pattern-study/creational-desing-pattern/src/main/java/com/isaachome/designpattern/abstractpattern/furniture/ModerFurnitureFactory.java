package com.isaachome.designpattern.abstractpattern.furniture;

import com.isaachome.designpattern.abstractpattern.furniture.modern.ModernChair;
import com.isaachome.designpattern.abstractpattern.furniture.modern.ModernCoffeeTable;
import com.isaachome.designpattern.abstractpattern.furniture.modern.ModernSofa;

public class ModerFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
