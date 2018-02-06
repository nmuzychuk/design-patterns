package com.nmuzychuk;

public class Sedan extends Car {

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }

}
