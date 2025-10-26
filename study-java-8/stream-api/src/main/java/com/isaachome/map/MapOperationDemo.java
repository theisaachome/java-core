package com.isaachome.map;

import com.isaachome.model.Person;

public class MapOperationDemo {
    public static void main(String[] args) {

          Person.persons()
                .stream()
                .map(Person::getName)
                .forEach(System.out::println);
    }
}
