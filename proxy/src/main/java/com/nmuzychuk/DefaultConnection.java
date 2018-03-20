package com.nmuzychuk;

public class DefaultConnection implements Connection {
    @Override
    public String connectTo(final String url) {
        return String.format("Connecting to %s", url);
    }
}
