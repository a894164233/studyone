package com.example.studyone.test;

import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        final int[] a = {0};
        long start = System.currentTimeMillis();
        IntStream.range(0, 10000000).forEach(s-> {
            a[0] +=s;
        });
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        start = System.currentTimeMillis();
        for (int s = 0; s < 10000000; s++) {
            a[0] +=s;
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);
        String test1 = "";
        System.out.println(test1);
        test();
    }

    public static void test() {
        System.out.println(1);
    }


}
