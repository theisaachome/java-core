package com.isaachome.arrays;

class Wrapper<T>{
    T data;
    Wrapper(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
public class GenericArray<T> {
    private T[] elements;

    public GenericArray(int size) {
//        this.elements = new T[size];
    }

    public static void main(String[] args) {
        Wrapper<?> unknownWrapper = new Wrapper<String>("hello World");
//        String str = unknownWrapper.getData();
        Object obj = unknownWrapper.getData();
//        unknownWrapper.setData(new Wrapper<>("Hello World"));

    }
}
