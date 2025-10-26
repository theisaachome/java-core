package com.isaachome.filter;

import com.isaachome.model.Person;

public class FilterOperation {
    public static void main(String[] args) {
        filterMale();
        filterMaleAndIncomes(4000);
    }
    static void filterFemale(){
        Person.persons()
                .stream()
                .filter(Person::isFemale)
                .map(Person::getName)
                .forEach(System.out::println);
    }
    static void filterMale(){
        Person.persons()
              .stream()
              .filter(Person::isMale)
              .filter(p->p.getIncomes()>4000)
              .map(Person::getName)
              .forEach(System.out::println);
    }
    static void filterMaleAndIncomes(double income){
        Person.persons()
                .stream()
                .filter(person-> person.getIncomes()>income)
                .map(Person::getName)
                .forEach(System.out::println);
    }
}
