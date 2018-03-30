package com.nmuzychuk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    private PrintStream out = System.out;
    private ByteArrayOutputStream arrayOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(arrayOut));
    }

    @Test
    public void testVisitor() {
        Node root = new Node(0);
        Node current = root;

        for (int i = 1; i < 10; i++) {
            Node next = new Node(i);
            current.setNext(next);
            current = next;
        }

        Visitor visitor = new PrintVisitor();
        root.accept(visitor);

        String expected = "0 1 2 3 4 5 6 7 8 9 ";

        assertEquals(expected, arrayOut.toString());
    }

    @After
    public void tearDown() {
        System.setOut(out);
    }
}
