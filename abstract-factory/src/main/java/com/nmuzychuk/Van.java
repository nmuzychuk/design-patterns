package com.nmuzychuk;

public class Van extends Vehicle {
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
