package com.bruno.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Lev, Eren, Mikasa, true, 200";
        String[] nomes = texto.split("\\d");
        for (String nome : nomes) {
            System.out.println(nome.trim());

        }

    }
}
