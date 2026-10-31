package com.isaachome.designpattern.prototype.hr;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Prototype<Employee> {
    private String name;
    private String employeeId;
    private String designation;
    private String department;
    private List<String> skills;


    Employee(String name, String employeeId, String designation, String department, List<String> skills) {
        this.name = name;
        this.employeeId = employeeId;
        this.designation = designation;
        this.department = department;
        this.skills = new ArrayList<>(skills);
    }

    @Override
    public Employee clone() {
        return new Employee(name, employeeId, designation, department, skills);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Skills: " + skills);
    }
}
