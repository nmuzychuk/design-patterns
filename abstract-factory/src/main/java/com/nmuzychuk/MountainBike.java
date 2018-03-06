package com.nmuzychuk;

public class MountainBike extends Vehicle {
    @Override
    public String getType() {
        return getClass().getSimpleName();
    }
}
