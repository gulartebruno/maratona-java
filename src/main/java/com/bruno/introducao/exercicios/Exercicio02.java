package com.bruno.introducao.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C;

        System.out.println("Escreva um valor inteiro para A:");
        int A = sc.nextInt();

        System.out.println("Escreva um valor inteiro para B:");
        int B = sc.nextInt();

        if (A == B) {
            C = A + B;
        } else {
            C = A * B;
        }

        System.out.println(C);

        sc.close();
    }
}
