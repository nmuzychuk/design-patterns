package com.nmuzychuk;

public class Original {
    private String state;

    Original(final String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    Memento save() {
        return new Memento(getState());
    }

    void restore(final Memento memento) {
        this.state = memento.getState();
    }
}
