package com.nmuzychuk;

public class Email implements Job {
    private Document document;

    Email(final Document document) {
        this.document = document;
    }

    @Override
    public void run() {
        document.email();
    }
}
