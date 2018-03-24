package com.nmuzychuk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PurchaseTest {
    private PrintStream out = System.out;
    private ByteArrayOutputStream arrayOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(arrayOut));
    }

    @Test
    public void testPurchaseMediator() {
        Cart cart = new ShoppingCart();
        Inventory inventory = new StoreInventory();
        Payment payment = new Payment();

        Purchase purchase = new Purchase(cart, inventory, payment);
        purchase.purchase("phone");

        List<String> expected = Arrays.asList(
                "Adding phone to cart",
                "Checking inventory",
                "Getting payment",
                "Reserving item\n"
        );

        assertEquals(String.join("\n", expected), arrayOut.toString());
    }

    @After
    public void tearDown() {
        System.setOut(out);
    }
}
