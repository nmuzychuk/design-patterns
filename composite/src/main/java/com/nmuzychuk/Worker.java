package com.nmuzychuk;

public class Worker implements Employee {
    private String name;

    Worker(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(final Employee employee) {
        // Empty method
    }

    @Override
    public void remove(final Employee employee) {
        // Empty method
    }

    @Override
    public void printStructure() {
        System.out.println(getName());
    }
}
