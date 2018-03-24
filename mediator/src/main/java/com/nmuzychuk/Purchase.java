package com.nmuzychuk;

public class Purchase {
    private Cart cart;
    private Inventory inventory;
    private Payment payment;

    Purchase(final Cart cart, final Inventory inventory, final Payment payment) {
        this.cart = cart;
        this.inventory = inventory;
        this.payment = payment;
    }

    void purchase(final String item) {
        cart.add(item);
        inventory.check();
        payment.get();
        inventory.reserve();
    }
}
