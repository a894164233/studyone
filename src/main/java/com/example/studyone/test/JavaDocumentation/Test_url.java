/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.studyone.test.JavaDocumentation;

import com.example.studyone.util.CommonEmun;
import org.springframework.context.annotation.Scope;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Scope
public class Test_url {

    private String name;
    private int wo;


    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://baidu.com/");
        System.out.println("hell");
        System.out.println("hell");
        URL url2 = new URL(url, "test2");
        URL url1 = new URL(url, "test1");

        try {
            List<String> list = new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        System.out.println(CommonEmun.Role.ADMIN.getValue());
        Thread thread = new Thread(getRunnable());
        thread.start();


    }

    private static Runnable getRunnable() {
        return () -> System.out.println(123);
    }


}
