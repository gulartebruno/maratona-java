package com.bruno.introducao.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1293.20;

        System.out.println("Escreva quanto um funcionário ganha:");
        double salario = sc.nextDouble();

        double salariosMinimosDentroDoSalario = salario/salarioMinimo;

        System.out.printf("O salário deste funcionário contém %.2f salários mínimos", salariosMinimosDentroDoSalario);


        sc.close();
    }
}
