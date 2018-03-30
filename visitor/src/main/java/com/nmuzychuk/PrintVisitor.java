package com.nmuzychuk;

public class PrintVisitor implements Visitor {
    @Override
    public void visit(final Node node) {
        Node current = node;

        while (current != null) {
            System.out.format("%s ", current.getData());
            current = current.getNext();
        }
    }
}
