package com.bruno.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes, DosFileAttributes, PosixfileAttributes

        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/new_path.txt");
        boolean isCreated = file.createNewFile();

        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(isModified);

    }
}
