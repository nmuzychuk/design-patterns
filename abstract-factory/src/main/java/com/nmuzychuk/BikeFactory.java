package com.nmuzychuk;

public class BikeFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(final String type) {
        switch (type) {
            case "Mountain":
                return new MountainBike();
            case "Racing":
                return new RacingBike();
            default:
                throw new RuntimeException("Invalid bike type");
        }
    }
}
