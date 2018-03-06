package com.nmuzychuk;

public class Minivan extends Vehicle {
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
