package com.bruno.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println();
        System.out.println(timeNow.getHour());
        System.out.println(timeNow.getMinute());
        System.out.println(timeNow.getSecond());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
