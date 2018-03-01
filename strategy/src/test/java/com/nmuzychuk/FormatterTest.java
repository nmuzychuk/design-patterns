package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormatterTest {
    @Test
    public void formatterTest() {
        String string = "Talk is cheap. Show me the code.";

        Formatter formatter = new DefaultFormatter();
        assertEquals(string, formatter.format(string));

        formatter = new UpperCaseFormatter();
        assertEquals(string.toUpperCase(), formatter.format(string));

        formatter = new LowerCaseFormatter();
        assertEquals(string.toLowerCase(), formatter.format(string));
    }
}
