package com.nmuzychuk;

public class Switch {
    private State state;

    Switch(final State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(final State state) {
        this.state = state;
    }
}
