package com.isaachome.designpattern.abstractfactory.furniture.modern;

import com.isaachome.designpattern.abstractfactory.furniture.product.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Modern Sofa");
    }
}
