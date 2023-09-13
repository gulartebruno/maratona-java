package com.bruno.javacore.ZZClambdas.test;

import com.bruno.javacore.ZZClambdas.dominio.Anime;
import com.bruno.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 100), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNonEstatic);
        System.out.println(animeList);
    }
}
