package com.nmuzychuk;

public abstract class DBConnectionTemplate {
    public abstract void setDriver();

    public abstract void setCredentials();

    public abstract void connect();

    public final void run() {
        setDriver();
        setCredentials();
        connect();
    }
}
