package com.example.studyone.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.channels.FileChannel;

public class DecoratorPattern {

    private volatile String test;

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("test.java" );
        FileInputStream fileInputStream = new FileInputStream(file);
        FileReader fileReader = new FileReader(file);
    }

}
