package com.isaachome.model;

import java.time.LocalDate;
import java.util.List;

public class Person{
    Integer id;
    String name;
    Gender gender;
    LocalDate birthdate;
    double incomes;

    public Person(Integer id, String name, Gender gender, LocalDate birthdate, double incomes) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.incomes = incomes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public double getIncomes() {
        return incomes;
    }

    public void setIncomes(double incomes) {
        this.incomes = incomes;
    }

    public static List<Person> persons() {
        return  List.of(new Person(1,"Donnie",Gender.FEMALE,LocalDate.of(1962,07,29),7800.00),
                new Person(2,"Kyaw Kyaw",Gender.MALE,LocalDate.of(1999,10,29),8000.00),
                new Person(3,"Hannie",Gender.FEMALE,LocalDate.of(2000,8,31),6000.000),
                new Person(4,"Thida",Gender.FEMALE,LocalDate.of(2001,9,19),4000.00),
                new Person(5,"Aung Aung",Gender.MALE,LocalDate.of(2005,1,31),1000.0),
                new Person(6,"Myo Myit Aung",Gender.MALE,LocalDate.of(2010,2,28),4500.00));
    }

    @Override
    public String toString() {
        return "Person{ " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birthdate=" + birthdate +
                ", incomes=" + incomes +
                '}';
    }

    public static boolean isFemale(Person person){
        return person.gender == Gender.FEMALE;
    }
    public static boolean isMale(Person person){
        return person.gender == Gender.MALE;
    }
}
