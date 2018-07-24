package com.example.studyone.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.channels.FileChannel;
import java.util.regex.Pattern;

public class DecoratorPattern {

    private volatile String test;

    public static void main(String[] args) throws FileNotFoundException {

//        File file = new File("TestColloection.java" );
//        FileInputStream fileInputStream = new FileInputStream(file);
//        FileReader fileReader = new FileReader(file);
        for(int i = 0; i < 10; i++) {
            String test = "TestColloection" + i;
            System.out.println(test);
            Pattern.compile("[test]buzhidao");
        }

    }

}
