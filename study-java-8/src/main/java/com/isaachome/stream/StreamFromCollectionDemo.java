package com.isaachome.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamFromCollectionDemo {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1,"Aung Aung",200000));
        employees.add(new Employee(2,"Zaw Zaw",450000));
        employees.add(new Employee(3,"Maw Maw",350000));

       Stream<Employee> sequentialStream= employees.stream();
       Stream<Employee> parallelStream= employees.parallelStream();

        employees.stream().forEach(System.out::println);
    }
}


class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}