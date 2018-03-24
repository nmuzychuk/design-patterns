package com.nmuzychuk;

public class ShoppingCart implements Cart {
    public void add(final String item) {
        System.out.format("Adding %s to cart\n", item);
    }
}
