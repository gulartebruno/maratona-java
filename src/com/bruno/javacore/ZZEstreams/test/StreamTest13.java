package com.bruno.javacore.ZZEstreams.test;

import com.bruno.javacore.ZZEstreams.dominio.Category;
import com.bruno.javacore.ZZEstreams.dominio.LightNovel;
import com.bruno.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.bruno.javacore.ZZEstreams.dominio.Category.*;
import static com.bruno.javacore.ZZEstreams.dominio.Promotion.*;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                ));
        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                )));
        System.out.println(collect1);
    }
}
