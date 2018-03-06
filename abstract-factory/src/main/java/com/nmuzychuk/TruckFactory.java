package com.nmuzychuk;

public class TruckFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(final String type) {
        switch (type) {
            case "Minivan":
                return new Minivan();
            case "Van":
                return new Van();
            default:
                throw new RuntimeException("Invalid truck type");
        }
    }
}
