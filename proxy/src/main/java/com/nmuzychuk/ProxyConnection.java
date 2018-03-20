package com.nmuzychuk;

import java.util.Arrays;
import java.util.List;

public class ProxyConnection implements Connection {
    private Connection connector = new DefaultConnection();

    private List<String> whitelist = Arrays.asList(
            "google.com", "stackoverflow.com", "github.com"
    );

    @Override
    public String connectTo(final String url) {
        if (whitelist.contains(url)) {
            return connector.connectTo(url);
        } else {
            return "Access denied";
        }
    }
}
