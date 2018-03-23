package com.nmuzychuk;

public class Add implements Expression {
    private Expression left;
    private Expression right;

    Add(final Expression left, final Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
