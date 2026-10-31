package com.isaachome.designpattern.abstractpattern.furniture.modern;

import com.isaachome.designpattern.abstractpattern.furniture.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Modern Sofa");
    }
}
