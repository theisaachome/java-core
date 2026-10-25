package com.isaachome.designpattern.simplefactory.store;

public class Phone extends Product {

    Phone() {
        System.out.println("Phone");
    }

    @Override
    public String toString() {
        return "Phone{}";
    }
}
