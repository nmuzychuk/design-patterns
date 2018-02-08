package com.nmuzychuk;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class FormBuilderTest {
    @Test
    public void testFormBuilder() {
        Form required = new Form.FormBuilder("user", new char[0]).build();
        assertEquals("user, *", required.toString());

        Form full = new Form.FormBuilder("user", new char[0])
                .firstName("John")
                .lastName("Smith")
                .dateOfBirth(LocalDate.of(1900, 1, 1))
                .build();
        assertEquals("user, *, John, Smith, 1900-01-01", full.toString());
    }
}
