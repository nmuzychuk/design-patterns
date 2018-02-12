package com.nmuzychuk;

public class User implements Observer {
    private String name;

    User(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.format("%s is notified\n", name);
    }
}
