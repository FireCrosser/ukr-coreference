package ua.edu.ukma.ukrcoref.utils;

import java.io.File;

public class FileLoader {

    public File getResourceFile(String path) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(path).
                getFile());
    }
}
