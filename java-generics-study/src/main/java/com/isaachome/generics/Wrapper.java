package com.isaachome.generics;

class MyClass<T,U,V,Z>{}
public class Wrapper <T>{
    private T ref;
    public Wrapper(T ref) {this.ref = ref;}
    public T getRef() {return ref;}
    public void setRef(T ref) {this.ref = ref;}

    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<String>("Hello");
    }

}

