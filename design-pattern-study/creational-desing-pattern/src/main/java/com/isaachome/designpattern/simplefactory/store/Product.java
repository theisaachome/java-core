package com.isaachome.designpattern.simplefactory.store;

public abstract class Product {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
