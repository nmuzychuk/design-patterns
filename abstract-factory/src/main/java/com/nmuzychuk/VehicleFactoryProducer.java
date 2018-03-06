package com.nmuzychuk;

public final class VehicleFactoryProducer {
    private VehicleFactoryProducer() {
    }

    public static AbstractVehicleFactory getFactory(final String type) {
        switch (type) {
            case "Bike":
                return new BikeFactory();
            case "Truck":
                return new TruckFactory();
            default:
                throw new RuntimeException("Invalid vehicle factory type");
        }
    }
}
