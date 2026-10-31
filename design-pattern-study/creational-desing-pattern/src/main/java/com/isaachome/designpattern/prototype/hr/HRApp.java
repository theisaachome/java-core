package com.isaachome.designpattern.prototype.hr;

import java.util.List;

public class HRApp {
    static void main() {
        var registry = new EmployeeRegistry();

        // Create employee templates
        var javaDeveloperTempalte = new Employee(
                "Template",
                "TEMP-001",
                "Java Engineer",
                "Engineering",
                List.of("Java", "Spring", "Hibernate")
        );

        // register prototype

        registry.register("JAVA_DEVELOPER", javaDeveloperTempalte);

        var employee001 = registry.create("JAVA_DEVELOPER");
        employee001.setName("John Doe");
        employee001.setEmployeeId("EMP-001");

        var employee002 = registry.create("JAVA_DEVELOPER");
        employee002.setName("Mary Doe");
        employee002.setEmployeeId("EMP-002");

        employee001.display();
        System.out.println("-------------");
        employee002.display();


    }
}
