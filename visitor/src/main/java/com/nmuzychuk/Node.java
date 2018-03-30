package com.nmuzychuk;

public class Node implements Element {
    private int data;
    private Node next;

    Node(final int data) {
        this.data = data;
    }

    int getData() {
        return data;
    }

    Node getNext() {
        return next;
    }

    void setNext(final Node node) {
        this.next = node;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
