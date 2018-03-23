package com.nmuzychuk;

public class Number implements Expression {
    private int n;

    Number(final int n) {
        this.n = n;
    }

    @Override
    public int interpret() {
        return n;
    }
}
