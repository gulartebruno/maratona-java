package com.bruno.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Bruno");
        nomes.add("Nogueira Gularte");
        nomes2.add("Leleo");
        nomes2.add("Clinton");

        for (Object nome: nomes){
            System.out.println(nome);
        }

        nomes2.addAll(nomes);

        System.out.println("-----------");
        for (int i = 0; i < nomes2.size(); i++) {
            System.out.println(nomes2.get(i));

        }


    }
}
