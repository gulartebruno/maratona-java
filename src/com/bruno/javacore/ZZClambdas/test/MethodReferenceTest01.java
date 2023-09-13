package com.bruno.javacore.ZZClambdas.test;

import com.bruno.javacore.ZZClambdas.dominio.Anime;
import com.bruno.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 100), new Anime("Naruto", 500)));
     //   Collections.sort(animeList, (a1,a2)-> a1.getTitle().compareTo(a2.getTitle()));
      //  Collections.sort(animeList, AnimeComparators::compareByTitle);
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);

    }
}
