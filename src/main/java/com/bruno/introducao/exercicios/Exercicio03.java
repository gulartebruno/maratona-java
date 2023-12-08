package com.bruno.introducao.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um número qualquer, positivo ou negativo:");
        double numero = sc.nextDouble();

        if (numero % 2 == 0 && numero > 0) {
            System.out.println("Par e positivo");
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.println("Par e negativo");
        } else if (!(numero % 2 == 0) && numero > 0) {
            System.out.println("Ímpar e positivo");
        } else  {
            System.out.println("Ímpar e negativo");
        }


        sc.close();
    }
}
