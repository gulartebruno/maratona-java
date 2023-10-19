package com.bruno.javacore.Ycolecoes.test;

import com.bruno.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Hellsing Ultimate");
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        //Ordenar por ordem alfabética
        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);
        System.out.println(dinheiros);

        for (String manga : mangas){
            System.out.println(manga);
        }


    }
}
