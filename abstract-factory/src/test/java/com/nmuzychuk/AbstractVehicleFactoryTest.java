package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractVehicleFactoryTest {
    @Test
    public void testAbstractVehicleFactory() {
        AbstractVehicleFactory bikeFactory = VehicleFactoryProducer.getFactory("Bike");

        Vehicle mountainBike = bikeFactory.getVehicle("Mountain");
        assertEquals("MountainBike", mountainBike.getType());

        Vehicle racingBike = bikeFactory.getVehicle("Racing");
        assertEquals("RacingBike", racingBike.getType());

        AbstractVehicleFactory truckFactory = VehicleFactoryProducer.getFactory("Truck");

        Vehicle miniVan = truckFactory.getVehicle("Minivan");
        assertEquals("Minivan", miniVan.getType());

        Vehicle van = truckFactory.getVehicle("Van");
        assertEquals("Van", van.getType());
    }
}
