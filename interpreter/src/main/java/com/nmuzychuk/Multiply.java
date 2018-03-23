package com.nmuzychuk;

public class Multiply implements Expression {
    private Expression left;
    private Expression right;

    Multiply(final Expression left, final Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
