package com.nmuzychuk;

public class VideoFileHandler extends FileHandler {
    @Override
    public void handle(final UserFile userFile) {
        if (userFile.getFileType() == FileType.VIDEO) {
            System.out.println("handling video file");
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
