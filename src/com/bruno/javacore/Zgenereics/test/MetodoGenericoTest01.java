package com.bruno.javacore.Zgenereics.test;

import com.bruno.javacore.Zgenereics.dominio.Barco;
import com.bruno.javacore.Zgenereics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        List<T> list = List.of(t);
        return List.of(t);
    }
}


