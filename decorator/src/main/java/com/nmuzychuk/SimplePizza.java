package com.nmuzychuk;

public class SimplePizza implements Pizza {
    @Override
    public String getDesc() {
        return "dough";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
