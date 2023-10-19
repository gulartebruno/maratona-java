package com.bruno.javacore.Dconstrutores.test;


import com.bruno.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akuma Drive", "TV", 12, "Ação","Production IG");
        anime.imprime();
        System.out.println();
    }
}
