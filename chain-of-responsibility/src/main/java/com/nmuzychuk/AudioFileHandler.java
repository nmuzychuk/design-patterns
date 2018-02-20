package com.nmuzychuk;

public class AudioFileHandler extends FileHandler {
    @Override
    public void handle(final UserFile userFile) {
        if (userFile.getFileType() == FileType.AUDIO) {
            System.out.println("handling audio file");
        } else {
            if (getNext() != null) {
                System.out.format("delegating to %s\n", getNext().getClass().getSimpleName());
                getNext().handle(userFile);
            } else {
                System.out.println("cannot handle file");
            }
        }
    }
}
