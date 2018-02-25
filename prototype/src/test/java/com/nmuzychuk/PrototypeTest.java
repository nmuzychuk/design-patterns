package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrototypeTest {
    @Test
    public void testPrototype() {
        Ship ship = new Ship("Ship");
        Ship dolly = ship.clone();
        dolly.setName("Dolly");

        assertEquals("Ship", ship.getName());
        assertEquals("Dolly", dolly.getName());
    }
}
