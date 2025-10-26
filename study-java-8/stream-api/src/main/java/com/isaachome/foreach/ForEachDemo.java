package com.isaachome.foreach;

import com.isaachome.model.Person;

import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        // list down only female
//        Person.of()
//                .stream().filter(Person::isFemale)
//                .forEach(System.out::println);
        List<Person> people = Person.persons();
        System.out.println("Before Increasing Salary:");
        people.stream().filter(Person::isFemale).forEach(System.out::println);
        // Increase the income of females by 10%
        people.stream().filter(Person::isFemale).forEach(person -> person.setIncomes(person.getIncomes()*1.10));
        System.out.println("After Increasing Salary:");
        people.stream().filter(Person::isFemale).forEach(System.out::println);


    }
}
