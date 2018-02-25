package com.nmuzychuk;

public class OracleConnection extends DBConnectionTemplate {
    @Override
    public void setDriver() {
        System.out.println("Setting Oracle driver");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting SYS credentials");
    }

    @Override
    public void connect() {
        System.out.print("Connecting...");
    }
}
