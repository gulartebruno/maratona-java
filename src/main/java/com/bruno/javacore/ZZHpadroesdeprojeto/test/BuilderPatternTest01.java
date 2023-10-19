package com.bruno.javacore.ZZHpadroesdeprojeto.test;

import com.bruno.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("Bruno")
                .lastName("Gularte")
                .userName("gulartebruno")
                .email("brunongularte@gmail.com")
                .build();

        System.out.println(build);
    }
}
