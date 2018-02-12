package com.nmuzychuk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class FeedTest {
    private PrintStream out = System.out;
    private ByteArrayOutputStream arrayOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(arrayOut));
    }

    @Test
    public void testObserver() {
        Feed feed = new Feed();

        User bob = new User("bob");
        User dan = new User("dan");

        feed.addObserver(bob);
        feed.notifyObservers();

        feed.addObserver(dan);
        feed.notifyObservers();

        feed.deleteObserver(bob);
        feed.notifyObservers();

        Stream<String> expected = Stream.of(
                "bob is notified\n",
                "bob is notified\n",
                "dan is notified\n",
                "dan is notified\n"
        );

        assertEquals(expected.collect(Collectors.joining()), arrayOut.toString());
    }

    @After
    public void tearDown() {
        System.setOut(out);
    }
}
