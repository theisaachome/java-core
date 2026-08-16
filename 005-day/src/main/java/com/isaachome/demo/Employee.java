package com.isaachome.demo;

public class Employee {
    private String name;
    private String email;
    private double salary;
    private String department;
    private String position;

    public Employee(String name, String email, double salary, String department, String position) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
}
