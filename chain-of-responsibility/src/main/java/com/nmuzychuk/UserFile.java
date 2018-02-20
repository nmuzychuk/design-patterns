package com.nmuzychuk;

public class UserFile {
    private FileType fileType;

    UserFile(final FileType fileType) {
        this.fileType = fileType;
    }

    public FileType getFileType() {
        return fileType;
    }
}
