package com.bruno.javacore.Bintroducaometodos.test;

import com.bruno.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int result = (int) calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);

        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println("--------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);

    }
}
