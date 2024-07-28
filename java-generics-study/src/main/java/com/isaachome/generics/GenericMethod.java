package com.isaachome.generics;

public class GenericMethod {
    public <K,V> boolean compare(Pair<K,V> p1, Pair<K,V>p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        OrderPaired<String,Integer> book1=new OrderPaired<>("Book",100);
        OrderPaired<String,Integer> book2 = new OrderPaired<>("Book",100);
        GenericMethod gm=new GenericMethod();
        System.out.println(gm.compare(book1,book2));
    }
}
