package com.nmuzychuk;

public abstract class FileHandler {
    private FileHandler next;

    public abstract void handle(UserFile userFile);

    public FileHandler getNext() {
        return next;
    }

    public void setNext(final FileHandler next) {
        this.next = next;
    }
}
