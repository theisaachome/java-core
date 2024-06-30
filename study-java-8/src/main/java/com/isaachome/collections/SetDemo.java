package com.isaachome.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // print-out names from getName
        for(var name:getName()){
            System.out.println(name);
        }
        System.out.println("++++++++++++++++");
        // print-out numbers
        for(int num: getNumbers()){
            System.out.println(num);
        }
    }
    static Set<String> getName(){
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Mercy");
        names.add("Paul");
        return  names;

    }
    static LinkedHashSet<Integer> getNumbers(){
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(40);
        return numbers;
    }
}
