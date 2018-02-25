package com.nmuzychuk;

public class MySQLConnection extends DBConnectionTemplate {
    @Override
    public void setDriver() {
        System.out.println("Setting MySQL driver");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting root credentials");
    }

    @Override
    public void connect() {
        System.out.print("Connecting...");
    }
}
