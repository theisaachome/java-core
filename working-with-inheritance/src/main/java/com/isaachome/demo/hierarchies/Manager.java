package com.isaachome.demo.hierarchies;

public class Manager extends Employee{

    public Manager(String name,String email,double salary){
        super(name,email,salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 10;
    }
}
