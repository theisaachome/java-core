package com.isaachome.designpattern.abstractfactory.furniture;

import com.isaachome.designpattern.abstractfactory.furniture.product.Chair;
import com.isaachome.designpattern.abstractfactory.furniture.product.CoffeeTable;
import com.isaachome.designpattern.abstractfactory.furniture.product.Sofa;
import com.isaachome.designpattern.abstractfactory.furniture.victorian.VictorianChair;
import com.isaachome.designpattern.abstractfactory.furniture.victorian.VictorianCoffeeTable;
import com.isaachome.designpattern.abstractfactory.furniture.victorian.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
