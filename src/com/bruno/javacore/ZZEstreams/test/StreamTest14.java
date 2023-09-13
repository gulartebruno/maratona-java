package com.bruno.javacore.ZZEstreams.test;

import com.bruno.javacore.ZZEstreams.dominio.Category;
import com.bruno.javacore.ZZEstreams.dominio.LightNovel;
import com.bruno.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.bruno.javacore.ZZEstreams.dominio.Category.*;
import static com.bruno.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static com.bruno.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, FANTASY),
            new LightNovel("Overlord", 10.99, FANTASY),
            new LightNovel("Violet Evergarden", 5.99, DRAMA),
            new LightNovel("No Game No Life", 2.99, FANTASY),
            new LightNovel("Fullmetal Alchemist", 8.99, FANTASY),
            new LightNovel("Kumo desuga", 1.99, FANTASY),
            new LightNovel("Kumo desuga", 1.99, FANTASY),
            new LightNovel("Monogatari", 4.00, ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
