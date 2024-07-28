package com.isaachome.methodss;


import java.util.ArrayList;
import java.util.List;

class Box<T>{
    private T t;
    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
class BoxDemo{
   static <U> void addBox(U v, List<Box<U>> boxes){
        Box<U> newBox = new Box<U>(v);
        boxes.add(newBox);
   }

   static <U> void showBoxes(List<Box<U>> boxes){
       int count=0;
        for(Box<U> box : boxes){
            U content = box.getT();
            System.out.printf("Box #%d contains [%s] \n",count,content.toString());
            count++;
        }
   }
}

class MyClass<X>{
    <T>MyClass(T t){
        System.out.println("T : "+t);
    }
}
public class GenericMethods {
    public static void main(String[] args) {
        List<Box<Integer>> boxes = new ArrayList<>();
        BoxDemo.addBox(100,boxes);
        BoxDemo.addBox(200,boxes);
        BoxDemo.addBox(300,boxes);
        BoxDemo.showBoxes(boxes);
        System.out.println("-------");
        new MyClass<String>(100);
        new MyClass<String>("hello Generic Constructor...");
    }
}
