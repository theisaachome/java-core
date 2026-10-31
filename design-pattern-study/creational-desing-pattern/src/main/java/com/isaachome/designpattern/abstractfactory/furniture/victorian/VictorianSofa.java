package com.isaachome.designpattern.abstractfactory.furniture.victorian;

import com.isaachome.designpattern.abstractfactory.furniture.product.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian Sofa");
    }
}
