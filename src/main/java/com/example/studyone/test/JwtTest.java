/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.studyone.test;

import org.springframework.dao.support.DataAccessUtils;

import javax.validation.constraints.DecimalMax;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.TemporalField;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class JwtTest {

    private static final ThreadLocal<DateFormat> df = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

//    public class TimerTaskThread extends Thread {
//        public TimerTaskThread() {
//            super.setName("TimerTaskThread");
//        }
//    }
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    DataAccessUtils dataAccessUtils;

    public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
//        String s = URLEncoder.encode("test", "utf-8");
//        System.out.println(s);
//        System.out.println(Charset.defaultCharset());
//        test(null);
//
//        Integer var1 = Integer.valueOf("123");
//        Integer var2 = 129;
//        System.out.println(Objects.equals(var1, var2));
//
//
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("1");
//        list.add("1");
//        list.add("1");
//        list.add("1");
//        list.add("1");
////        List<String> subList = list.subList(1,3);
////        list.add("1");
////        System.out.println(subList.size());
//
//
//        String[] array = new String[list.size()];
//        array = list.toArray(array);
//        System.out.println(array.length);
//
//        list = Arrays.asList(array);
//        array[0] = "test";
//        System.out.println(list.get(0));
//
//        Map<String, String> map = new HashMap<>();
//        map.put("a", "a");
//        map.put("b", "b");
//        map.put("c", "c");
//        map.put("d", "d");
//        map.entrySet().forEach(entry -> {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        });
//        map.keySet().forEach(s1 -> System.out.println(map.get(s1)));
//        map.values().forEach(System.out::println);

//        list.add("1");

//        Map<String, String> hashtable = new Hashtable();
//        hashtable.put("a", "b");
//        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
//        concurrentHashMap.put("a", "b");
//        Map<String, String> treeMap = new TreeMap<>();
//        treeMap.put("a", "b");
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("a", "b");
//        hashMap.put(null, "b");
//        hashMap.forEach((s, s2) -> {
//            System.out.println(s);
//            System.out.println(s2);
//        });

//        ThreadPoolExecutor threadPoolExecutor =
//          Executor executor = Executors.newFixedThreadPool(10);
//          BlockingDeque<Runnable> arrayBlockingQueue = (BlockingDeque<Runnable>) new ArrayBlockingQueue(10);
//          Executor executor1 = new ThreadPoolExecutor(1, 2, 2L, TimeUnit.DAYS, arrayBlockingQueue);

//          simpleDateFormat.format("");

        Instant instant;
        LocalDateTime localDateTime;
        Calendar calendar = Calendar.getInstance();
        calendar.getTimeInMillis();

//        TimerTask timer = new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println(123);
//            }
//        };
//        timer.run();
//        Timer timer1;
//        TimerTask timerTask = null;
//        timerTask.scheduledExecutionTime();

//        CountDownLatch countDownLatch = new CountDownLatch(5);
//        countDownLatch.await(1L, TimeUnit.HOURS);
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

        AtomicInteger atomicInteger = new AtomicInteger(1);
        atomicInteger.getAndAdd(1);

        LongAdder longAdder = new LongAdder();
        longAdder.add(1);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                outerLoop:
//Label
                for (int k = 1; k <= j; k++) {
                    System.out.print(k + "\t");
                    break outerLoop;
                }
                System.out.println("fasdf");
            }
            System.out.println();
        }

        Map<String, String> map = new HashMap<>();
        map.put("fd", "sd");
        test("test");
        Math.random();
        Random random = new Random();
        random.nextInt(10);
        random.nextLong();
        random.nextLong();

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());
        System.out.println(Instant.now().toEpochMilli());

        System.out.println(1_0_0_0_0_0_0 - 1000);
        NullPointerException nullPointerException;
        BigDecimal bigDecimal = new BigDecimal(2);
        System.out.println(bigDecimal.doubleValue());

        String testWode;

    }

    /**
     * test
     *
     * @param a
     */
    public static void test(String a) {
        System.out.println(Objects.equals(a, "a"));
    }

}
