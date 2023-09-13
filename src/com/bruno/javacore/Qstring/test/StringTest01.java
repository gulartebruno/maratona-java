package com.bruno.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Bruno"; //String constant pool
        String nome2 = "Bruno";
        nome = nome.concat(" Gularte");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Bruno"); // 1 variável de referência, 2 objeto do tipo string, 3 uma stirng no pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
