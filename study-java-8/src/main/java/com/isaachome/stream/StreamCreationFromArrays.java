package com.isaachome.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreationFromArrays {
    public static void main(String[] args) {
      Arrays.stream(new int[]{1, 2, 3, 4, 5}).forEach(System.out::println);

      Stream<Student> studentStrea= Arrays.stream(
              new Student[]{
              new Student("Aung Aung",20,"aung@gmail.com"),
              new Student("Aung Aung",20,"aung@gmail.com"),
              new Student("Aung Aung",20,"aung@gmail.com")});
      studentStrea.forEach(System.out::println);

      Stream.of(new Student[]{
              new Student("Aung Aung",20,"aung@gmail.com"),
              new Student("Aung Aung",20,"aung@gmail.com"),
              new Student("Aung Aung",20,"aung@gmail.com")} ).forEach(System.out::println);
    }
}

class Student{
    private String name;
    private int age;
    private String email;
    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}