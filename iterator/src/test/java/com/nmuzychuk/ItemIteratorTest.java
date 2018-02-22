package com.nmuzychuk;

import org.junit.Test;

import java.util.Iterator;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ItemIteratorTest {
    @Test
    public void testItemIterator() {
        Item[] words = {new Item("C"), new Item("Java"), new Item("Ruby")};
        Iterator<Item> itemIterator = new ItemIterator(words);

        assertTrue(itemIterator.hasNext());
        assertEquals("C", itemIterator.next().toString());
        assertTrue(itemIterator.hasNext());
        assertEquals("Java", itemIterator.next().toString());
        assertTrue(itemIterator.hasNext());
        assertEquals("Ruby", itemIterator.next().toString());
        assertFalse(itemIterator.hasNext());
    }
}
