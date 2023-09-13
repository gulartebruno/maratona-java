package com.bruno.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Bruno Nogueira";
        nome.concat(" Gularte");

        nome = nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Bruno Nogueira");
        sb.append( " Gularte");
        ;

        System.out.println(sb.toString());
    }
}
