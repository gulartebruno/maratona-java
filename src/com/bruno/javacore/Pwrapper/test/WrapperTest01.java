package com.bruno.javacore.Pwrapper.test;

import java.util.List;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 1F;
        double doubleP = 100;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;     //autoboxing
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing

        Integer intW2 = Integer.parseInt("1");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('$'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('a'));


    }
}
