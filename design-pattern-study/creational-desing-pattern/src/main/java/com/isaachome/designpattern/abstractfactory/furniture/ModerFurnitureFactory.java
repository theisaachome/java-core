package com.isaachome.designpattern.abstractfactory.furniture;

import com.isaachome.designpattern.abstractfactory.furniture.modern.ModernChair;
import com.isaachome.designpattern.abstractfactory.furniture.modern.ModernCoffeeTable;
import com.isaachome.designpattern.abstractfactory.furniture.modern.ModernSofa;
import com.isaachome.designpattern.abstractfactory.furniture.product.Chair;
import com.isaachome.designpattern.abstractfactory.furniture.product.CoffeeTable;
import com.isaachome.designpattern.abstractfactory.furniture.product.Sofa;

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
