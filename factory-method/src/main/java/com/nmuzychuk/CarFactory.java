package com.nmuzychuk;

enum CarType {
    Hatchback, Sedan
}

public class CarFactory {

    public Car getCar(final CarType carType) {
        switch (carType) {
            case Hatchback:
                return new Hatchback();
            case Sedan:
                return new Sedan();
            default:
                throw new RuntimeException("Invalid car type");
        }

    }

}
