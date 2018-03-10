package com.nmuzychuk;

public class Laptop implements Computer {
    private Mouse mouse;

    Laptop(final Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void compute() {

    }

    @Override
    public String toString() {
        return String.format("%s with %s",
                getClass().getSimpleName(), mouse.getClass().getSimpleName());
    }

}
