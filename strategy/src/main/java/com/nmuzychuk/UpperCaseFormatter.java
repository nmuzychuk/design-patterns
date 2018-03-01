package com.nmuzychuk;

public class UpperCaseFormatter implements Formatter {
    @Override
    public String format(final String text) {
        return text.toUpperCase();
    }
}
