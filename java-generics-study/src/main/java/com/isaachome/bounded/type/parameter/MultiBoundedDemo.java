package com.isaachome.bounded.type.parameter;

class A{}
interface B{}
interface C{}
class D<T extends A & B & C>{

}
class E extends A{}
public class MultiBoundedDemo {
    public static void main(String[] args) {
//        var d = new D<E>();
    }
}
