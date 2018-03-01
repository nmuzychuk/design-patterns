package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StateTest {
    @Test
    public void stateTest() {
        State off = new OffState();
        Switch s = new Switch(off);

        assertEquals("OFF", s.getState().toString());

        State on = new OnState();
        on.toggle(s);
        assertEquals("ON", s.getState().toString());

        off.toggle(s);
        assertEquals("OFF", s.getState().toString());
    }
}
