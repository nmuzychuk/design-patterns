package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarFactoryTest {

    @Test
    public void testCarFactory() {
        CarFactory factory = new CarFactory();

        Car hatchback = factory.getCar(CarType.Hatchback);
        assertEquals("Hatchback", hatchback.getType());

        Car sedan = factory.getCar(CarType.Sedan);
        assertEquals("Sedan", sedan.getType());
    }

}
