package com.nmuzychuk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    private PrintStream out = System.out;
    private ByteArrayOutputStream arrayOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(arrayOut));
    }

    @Test
    public void testEmployee() {
        Employee ceo = new Manager("CEO");
        Employee topManager = new Manager("Top manager");
        ceo.add(topManager);
        Employee worker = new Worker("Top manager worker");
        topManager.add(worker);
        Employee middleManager = new Manager("Middle manager");
        topManager.add(middleManager);
        for (int i = 1; i <= 2; i++) {
            worker = new Worker(String.format("Middle manager worker %s", i));
            middleManager.add(worker);
        }

        ceo.printStructure();

        Stream<String> expected = Stream.of(
                "CEO",
                "Top manager",
                "Top manager worker",
                "Middle manager",
                "Middle manager worker 1",
                "Middle manager worker 2\n"
        );

        assertEquals(expected.collect(Collectors.joining("\n")), arrayOut.toString());

    }

    @After
    public void tearDown() {
        System.setOut(out);
    }
}
