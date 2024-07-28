package com.isaachome.generics;

public class BoundedTypeParameter<T> {
    private T data;

    public BoundedTypeParameter(){}
    public BoundedTypeParameter(T data) {
        this.data = data;
    }
    public T getData() {return data;}
    public <U extends  Number>void inspect(U u){
        System.out.println("T is : " + data.getClass().getName());
        System.out.println("U is : " + u.getClass().getName());
    }

    public static void main(String[] args) {
      BoundedTypeParameter<String> btp = new BoundedTypeParameter<String>("Hello Bounded Type");
//      btp.inspect("Hello U Type");
      btp.inspect(100);
    }
}
