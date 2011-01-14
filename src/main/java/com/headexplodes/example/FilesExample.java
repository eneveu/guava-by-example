package com.headexplodes.example;

import com.google.common.base.Charsets;
import com.google.common.base.Throwables;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FilesExample {

    public void readLinesClassic(File file) {
        List<String> lines = null;
        try {
            lines = Files.readLines(file, Charsets.UTF_8);
        } catch (IOException ioex) {
            throw Throwables.propagate(ioex);
        }
    }


    public void readLinesGuava(File file) {
        List<String> lines = null;
        try {
            lines = Files.readLines(file, Charsets.UTF_8);
        } catch (IOException ioex) {
            throw Throwables.propagate(ioex);
        }
    }
}
