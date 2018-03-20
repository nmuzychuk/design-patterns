package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProxyConnectionTest {
    @Test
    public void testProxyConnection() {
        Connection defaultConnection = new DefaultConnection();
        String url = "google.com";

        assertEquals("Connecting to google.com",
                defaultConnection.connectTo(url));

        Connection proxyConnection = new ProxyConnection();
        assertEquals("Connecting to google.com",
                proxyConnection.connectTo(url));

        url = "facebook.com";

        assertEquals("Connecting to facebook.com",
                defaultConnection.connectTo(url));
        assertEquals("Access denied", proxyConnection.connectTo(url));
    }
}
