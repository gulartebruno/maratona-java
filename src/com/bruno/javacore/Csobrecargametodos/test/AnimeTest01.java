package com.bruno.javacore.Csobrecargametodos.test;

import com.bruno.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akuma Drive","TV",12);
        anime.imprime();
    }
}
