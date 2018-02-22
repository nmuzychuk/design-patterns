package com.nmuzychuk;

public class Item {
    private String name;

    public Item(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
