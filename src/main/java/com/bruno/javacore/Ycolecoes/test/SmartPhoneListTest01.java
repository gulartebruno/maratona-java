package com.bruno.javacore.Ycolecoes.test;

import com.bruno.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("2222", "Pixel");
        Smartphone s3 = new Smartphone("3333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);


        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("2222", "Pixel");

        System.out.println(smartphones.contains(s4));
        int indexOfSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(1));
    }
}
