package com.isaachome.designpattern.abstractfactory.furniture.modern;

import com.isaachome.designpattern.abstractfactory.furniture.product.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair");
    }
}
