package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    @Test
    public void testComputer() {
        Mouse mouse = new USBMouse();
        Computer computer = new Desktop(mouse);

        assertEquals("Desktop with USBMouse", computer.toString());

        mouse = new WirelessMouse();
        computer = new Laptop(mouse);

        assertEquals("Laptop with WirelessMouse", computer.toString());

    }
}
