package com.nmuzychuk;

public class OffState implements State {
    @Override
    public void toggle(final Switch s) {
        s.setState(this);
    }

    @Override
    public String toString() {
        return "OFF";
    }
}
