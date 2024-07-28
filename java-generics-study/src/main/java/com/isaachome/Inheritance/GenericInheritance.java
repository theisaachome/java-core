package com.isaachome.Inheritance;

import java.util.List;

class Box<T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
interface PayloadList<E,P> extends List<E> {
    void setPayloadList(int index,P list);
}

public class GenericInheritance {
    public static void main(String[] args) {
        Box<Integer> myBox = new Box<Integer>();
        myBox.setData(10);
        System.out.println(myBox.getData());

//        boxTest(myBox);
    }

    static void boxTest(Box<Number> myBox) {
        System.out.println(myBox.getData());
    }
}
