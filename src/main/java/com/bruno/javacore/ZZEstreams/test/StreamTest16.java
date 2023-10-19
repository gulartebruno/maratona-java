package com.bruno.javacore.ZZEstreams.test;

import com.bruno.javacore.ZZEstreams.dominio.Category;
import com.bruno.javacore.ZZEstreams.dominio.LightNovel;
import com.bruno.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.bruno.javacore.ZZEstreams.dominio.Category.*;
import static com.bruno.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static com.bruno.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest16 {


    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10000000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);

    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }


}
