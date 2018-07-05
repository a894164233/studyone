package com.example.studyone.test;

import org.apache.ibatis.io.Resources;
import java.io.IOException;

public class test {
    public static void main(String[] args) {

        System.out.printf(Thread.currentThread().getState().name());
        try {
            Resources.getResourceAsReader("test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
