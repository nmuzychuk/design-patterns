package com.nmuzychuk;

public class Hatchback extends Car {

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }

}
