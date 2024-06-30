package com.isaachome.basic;


@FunctionalInterface
interface  NoParameter{
    void print();
}
@FunctionalInterface
interface  OneParameter{
    void print(String s);
}

@FunctionalInterface
interface  MultiParameter{
    void print(String s1,String s2);
}
public class ImplementSyntax {
    public static void main(String[] args) {
        NoParameter noParameter =()-> System.out.println("Hello No Parameter.");
        OneParameter oneParameter =(s)-> System.out.println("Hello One Parameter : " + s);
        MultiParameter multiParameter = (s,s2)->{
            System.out.println("Hello First Parameter : " + s);
            System.out.println("Hello Second Parameter : " + s2);
        };
        noParameter.print();
        oneParameter.print("Isaac");
        multiParameter.print("Isaac","Mercy");
    }
}
