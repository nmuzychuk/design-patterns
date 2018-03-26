package com.nmuzychuk;

public class Memento {
    private String state;

    Memento(final String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
