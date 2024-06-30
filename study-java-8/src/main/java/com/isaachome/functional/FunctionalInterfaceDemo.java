package com.isaachome.functional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

enum Gender{
    MALE, FEMALE
}
class Person{
    private  String fullname;
    private LocalDate dob;
    private Gender gender;

    public Person(String fullname, LocalDate dob, Gender gender) {
        this.fullname = fullname;
        this.dob = dob;
        this.gender = gender;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
           return fullname + ", "  + gender + ", " + dob + " ";
    }

    static List<Person> getPersons(){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("John Jacobs", LocalDate.of(1975, 1, 20), Gender.MALE));
        list.add(new Person("Wally Inman", LocalDate.of(1965, 9, 12), Gender.MALE));
        list.add(new Person("Donna Jacobs", LocalDate.of(1970, 9, 12), Gender.FEMALE));
        return list;
    }
}


class FunctionalUtil{
    // Applies an action on each item in a list
    public static <T> void forEach(List<T> list, Consumer<? super  T> action){
        for(T t: list){
            action.accept(t);
        }
    }
    // Applies a filter to a list and returned the filtered list items
   public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList =new ArrayList<>();
        for(T item:list){
            if(predicate.test(item)){
                filteredList.add(item);
            }
        }
        return  filteredList;
    }
    // Maps each item in a list to a value
   public static <T,R> List<R> map(List<T> list, Function<? super T,R> mapper ){
        List<R> mappedList = new ArrayList<>();
        for(T item:list){
            mappedList.add(mapper.apply(item));
        }
        return  mappedList;
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        List<Person> list = Person.getPersons();
        // Use the forEach() method to print each person in the list
        System.out.println("Original list of persons:");
        FunctionalUtil.forEach(list,person -> System.out.println(person));

        // Filter only males
        List<Person> maleList= FunctionalUtil.filter(list,person -> person.getGender()==Gender.MALE);
        System.out.println("\nMales only:");
        FunctionalUtil.forEach(maleList,System.out::println);

        // Map each person to his/her year of birth
        List<Integer> dobList= FunctionalUtil.map(list,person -> person.getDob().getYear());
        System.out.println("\nPersons mapped to year of their birth:");
        FunctionalUtil.forEach(dobList,System.out::println);

         // Apply an action to each person in the list
        // Add one year to each male's dob
        FunctionalUtil.forEach(maleList,person -> person.setDob(person.getDob().plusYears(1)));
        System.out.println("\nMales only after adding 1 year to DOB:");
        FunctionalUtil.forEach(maleList,System.out::println);

    }
}
