package com.nmuzychuk;

public class OnState implements State {
    @Override
    public void toggle(final Switch s) {
        s.setState(this);
    }

    @Override
    public String toString() {
        return "ON";
    }
}
