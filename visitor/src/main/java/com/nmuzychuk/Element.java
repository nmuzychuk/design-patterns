package com.nmuzychuk;

public interface Element {
    void accept(Visitor visitor);
}
