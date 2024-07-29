package com.isaachome;

import com.isaachome.model.Person;

import java.util.List;

public class MapOperationDemo {
    public static void main(String[] args) {

          Person.of()
                .stream()
                .map(Person::getName)
                .forEach(System.out::println);
    }
}
