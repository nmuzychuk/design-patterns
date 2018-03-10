package com.nmuzychuk;

public class Desktop implements Computer {
    private Mouse mouse;

    Desktop(final Mouse mouse) {
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
