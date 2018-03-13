package com.nmuzychuk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class VacationFacadeTest {
    private PrintStream out = System.out;
    private ByteArrayOutputStream arrayOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(arrayOut));
    }

    @Test
    public void testVacationFacade() {
        VacationFacade.prepareVacation();

        Stream<String> expected = Stream.of(
                "Boss: Vacation is granted",
                "TravelAgent: Hotel is booked",
                "Assistant: Flight is booked\n"
        );

        assertEquals(expected.collect(Collectors.joining("\n")), arrayOut.toString());
    }

    @After
    public void tearDown() {
        System.setOut(out);
    }
}
