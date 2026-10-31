package com.isaachome.designpattern.abstractfactory.furniture.victorian;

import com.isaachome.designpattern.abstractfactory.furniture.product.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair");
    }
}
