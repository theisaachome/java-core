package com.isaachome.designpattern.abstractpattern.furniture.modern;

import com.isaachome.designpattern.abstractpattern.furniture.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair");
    }
}
