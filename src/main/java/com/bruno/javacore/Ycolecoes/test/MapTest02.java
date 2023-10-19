package com.bruno.javacore.Ycolecoes.test;

import com.bruno.javacore.Ycolecoes.dominio.Consumidor;
import com.bruno.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Bruno Gularte");
        Consumidor consumidor2 = new Consumidor("Glauber Clinton");

        Manga manga1 = new Manga(1L, "Attack on titan", 9.5);
        Manga manga2 = new Manga(4L, "Berserk", 3.2);
        Manga manga3 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga4 = new Manga(3L, "Pokemon", 11.20);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99  );

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,manga1);
        consumidorManga.put(consumidor2,manga4);

        for (Map.Entry<Consumidor , Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " - "+ entry.getValue().getNome());
        }

    }
}
