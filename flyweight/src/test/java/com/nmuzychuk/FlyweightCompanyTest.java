package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FlyweightCompanyTest {
    @Test
    public void testFlyweight() {
        Programmer charlie = FlyweightCompany.getProgrammer("C");
        Programmer james = FlyweightCompany.getProgrammer("Java");

        assertNotEquals(charlie.code(), james.code());
        assertNotEquals(charlie.toString(), james.toString());

        Programmer william = FlyweightCompany.getProgrammer("Web");

        for (int i = 0; i < 10; i++) {
            assertEquals(william.toString(), FlyweightCompany.getProgrammer("Web").toString());
        }
    }
}
