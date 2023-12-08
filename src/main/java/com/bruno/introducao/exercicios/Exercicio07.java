package com.bruno.introducao.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso em Kg");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura em m");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc <=29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2");
        }else {
            System.out.println("Obesidade grau 3");
        }

        sc.close();
    }
}
