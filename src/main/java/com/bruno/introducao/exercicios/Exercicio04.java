package com.bruno.introducao.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um número:");
        int numero = sc.nextInt();

        System.out.println(numero-1 + " " + (numero+1));

        sc.close();
    }
}
