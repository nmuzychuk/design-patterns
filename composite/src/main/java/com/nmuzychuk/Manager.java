package com.nmuzychuk;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private List<Employee> employees;

    Manager(final String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(final Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public void remove(final Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public void printStructure() {
        System.out.println(getName());
        for (Employee e : employees) {
            e.printStructure();
        }
    }
}
