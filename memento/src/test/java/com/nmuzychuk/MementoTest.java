package com.nmuzychuk;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MementoTest {
    @Test
    public void testMemento() {
        Original original = new Original("initial");
        Memento initial = original.save();
        original.setState("intermediate");
        Memento intermediate = original.save();

        original.setState("final");
        assertEquals("final", original.getState());

        original.restore(intermediate);
        assertEquals("intermediate", original.getState());

        original.restore(initial);
        assertEquals("initial", original.getState());
    }
}
