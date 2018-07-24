package com.example.studyone.test;

import java.util.*;

public class TestColloection {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        Hashtable hashtable;
        Map<String, String> hashMap = new HashMap();
        List<String> list1 = new ArrayList<>();
//        Collections.synchronizedSet()
        Map<String, String> map1 = Collections.synchronizedMap(hashMap);
        List<String> list2 = Collections.synchronizedList(list1);

//        Collections.synchronizedSet()
//        Collections.synchronizedSet()
    }
}
