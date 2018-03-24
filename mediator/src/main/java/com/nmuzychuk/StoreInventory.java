package com.nmuzychuk;

public class StoreInventory implements Inventory {
    public void check() {
        System.out.println("Checking inventory");
    }

    public void reserve() {
        System.out.println("Reserving item");
    }
}
