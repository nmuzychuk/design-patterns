package com.nmuzychuk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JobTest {
    private PrintStream out = System.out;
    private ByteArrayOutputStream arrayOut = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(arrayOut));
    }

    @Test
    public void testJob() {
        Document document = new Document();

        Job index = new Index(document);
        Job email = new Email(document);

        Worker worker = new Worker();

        worker.addJob(index);
        worker.addJob(email);

        worker.runJobs();

        List<String> expected = Arrays.asList(
                "Indexing document",
                "Emailing document\n"
        );

        assertEquals(String.join("\n", expected), arrayOut.toString());
    }

    @After
    public void tearDown() {
        System.setOut(out);
    }
}
