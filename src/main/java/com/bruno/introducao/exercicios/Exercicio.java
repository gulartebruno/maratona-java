package com.bruno.introducao.exercicios;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        long fatorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um numero para fatorial:");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero ; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);

        sc.close();
    }
}