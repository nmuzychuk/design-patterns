package com.nmuzychuk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;

public class FileHandlerTest {
    private PrintStream out = System.out;
    private ByteArrayOutputStream arrayOut;

    private FileHandler videoFileHandler = new VideoFileHandler();
    private FileHandler audioFileHandler = new AudioFileHandler();
    private FileHandler textFileHandler = new TextFileHandler();

    @Before
    public void setUp() {
        audioFileHandler.setNext(videoFileHandler);
        textFileHandler.setNext(audioFileHandler);

        arrayOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(arrayOut));
    }

    @Test
    public void testTextFile() {
        textFileHandler.handle(new UserFile(FileType.TEXT));

        Stream<String> expected = Stream.of(
                "handling text file\n"
        );

        assertEquals(expected.collect(Collectors.joining()), arrayOut.toString());
    }

    @Test
    public void testAudioFile() {
        textFileHandler.handle(new UserFile(FileType.AUDIO));

        Stream<String> expected = Stream.of(
                "delegating to AudioFileHandler\n",
                "handling audio file\n"
        );

        assertEquals(expected.collect(Collectors.joining()), arrayOut.toString());
    }

    @Test
    public void testVideoFile() {
        textFileHandler.handle(new UserFile(FileType.VIDEO));

        Stream<String> expected = Stream.of(
                "delegating to AudioFileHandler\n",
                "delegating to VideoFileHandler\n",
                "handling video file\n"
        );

        assertEquals(expected.collect(Collectors.joining()), arrayOut.toString());
    }

    @Test
    public void testImageFile() {
        textFileHandler.handle(new UserFile(FileType.IMAGE));

        Stream<String> expected = Stream.of(
                "delegating to AudioFileHandler\n",
                "delegating to VideoFileHandler\n",
                "cannot handle file\n"
        );

        assertEquals(expected.collect(Collectors.joining()), arrayOut.toString());
    }

    @After
    public void tearDown() {
        System.setOut(out);
    }
}
