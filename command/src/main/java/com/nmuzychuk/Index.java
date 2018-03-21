package com.nmuzychuk;

public class Index implements Job {
    private Document document;

    Index(final Document document) {
        this.document = document;
    }

    @Override
    public void run() {
        document.index();
    }
}
