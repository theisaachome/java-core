package com.isaachome.generics;

public class GenericBox <T>{
     private T value;

     public GenericBox() {}
     public GenericBox(T value){
         this.value = value;
     }
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
