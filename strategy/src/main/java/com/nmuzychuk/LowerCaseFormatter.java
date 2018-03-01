package com.nmuzychuk;

public class LowerCaseFormatter implements Formatter {
    @Override
    public String format(final String text) {
        return text.toLowerCase();
    }
}
