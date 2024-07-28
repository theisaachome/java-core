package com.isaachome.generics;


public class MultipleTypeParameter {
    public static void main(String[] args) {
        OrderPaired<String,Integer> book = new OrderPaired<>("Book",100);
        OrderPaired<String,String> student = new OrderPaired<>("Name","Aung Aung");
        GenericBox rawBox = new GenericBox<>();
    }
}
