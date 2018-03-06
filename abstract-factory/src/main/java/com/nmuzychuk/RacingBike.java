package com.nmuzychuk;

public class RacingBike extends Vehicle {
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
