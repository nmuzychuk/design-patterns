package com.nmuzychuk;

public class Ship implements Prototype {
    private String name;

    Ship(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public Ship clone() {
        Ship ship = null;

        try {
            ship = (Ship) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return ship;
    }
}
