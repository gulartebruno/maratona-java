package com.bruno.introducao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        Integer idade;

        System.out.println("Digite o seu nome:");

        name = sc.nextLine();

        System.out.println("Digite a sua idade:");
        System.out.println("Seja Bem-vindo(a) " + name);



        sc.close();
    }
}
