package com.bruno.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    public static void main(String[] args) {

        Optional<String> o1 = Optional.of("Aha Uhu lalala");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("_--------------------");
        String name = findName("Bruno");

        Optional<String> nameOptional = Optional.ofNullable(findName("Bruno"));
        String emtpy = nameOptional.orElse("EMTPY");
        nameOptional.ifPresent(String::toUpperCase);
        System.out.println(emtpy);
    }

    private static String findName(String name) {
        List<String> list = List.of("Bruno", "Gularte");
        int i = list.indexOf(name);
        if (i != 1) {
            return list.get(i);
        }
        return null;

    }
}
