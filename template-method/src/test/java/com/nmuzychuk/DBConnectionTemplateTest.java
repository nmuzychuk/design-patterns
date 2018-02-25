package com.nmuzychuk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class DBConnectionTemplateTest {
    private PrintStream out = System.out;
    private ByteArrayOutputStream arrayOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(arrayOut));
    }

    @Test
    public void testMySQLTask() {
        DBConnectionTemplate mysql = new MySQLConnection();
        mysql.run();

        String expected = Stream.of(
                "Setting MySQL driver",
                "Setting root credentials",
                "Connecting..."
        ).collect(Collectors.joining("\n"));

        assertEquals(expected, arrayOut.toString());
    }

    @Test
    public void testOracleTask() {
        DBConnectionTemplate oracle = new OracleConnection();
        oracle.run();

        String expected = Stream.of(
                "Setting Oracle driver",
                "Setting SYS credentials",
                "Connecting..."
        ).collect(Collectors.joining("\n"));

        assertEquals(expected, arrayOut.toString());
    }

    @After
    public void tearDown() {
        System.setOut(out);
    }
}
