package com.isaachome.designpattern.prototype.hr;

import java.util.HashMap;
import java.util.Map;

class EmployeeRegistry {

    private Map<String, Employee> template = new HashMap<>();

    void register(String key, Employee employee) {
        template.put(key, employee);
    }

    public Employee create(String key) {
        // deep copy
        var employee = template.get(key);
        if (employee == null) {
            throw new IllegalArgumentException("Template not found" + key);
        }
        return template.get(key).clone();
    }
}
