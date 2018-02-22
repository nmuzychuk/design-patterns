package com.nmuzychuk;

import java.util.Iterator;

public class ItemIterator implements Iterator<Item> {
    private Item[] items;
    private int index = 0;

    ItemIterator(final Item[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.length && items[index] != null;
    }

    @Override
    public Item next() {
        return items[index++];
    }
}
