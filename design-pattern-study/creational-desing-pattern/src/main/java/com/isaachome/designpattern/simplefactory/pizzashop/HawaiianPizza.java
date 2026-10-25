package com.isaachome.designpattern.simplefactory.pizzashop;

public class HawaiianPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Hawaiian Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Hawaiian Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Hawaiian Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Hawaiian Pizza");
    }
}
