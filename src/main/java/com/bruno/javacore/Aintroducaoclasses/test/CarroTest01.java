package com.bruno.javacore.Aintroducaoclasses.test;

import com.bruno.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.modelo = "Gol";
        carro01.ano = 2001;
        carro01.nome = "Volkswagen";

        Carro carro02 = new Carro();
        carro02.modelo = "Uno Mili";
        carro02.nome = "Fiat";
        carro02.ano = 1980;

        carro01 = carro02;

        System.out.println(carro01.ano);
        System.out.println(carro01.modelo);
        System.out.println(carro01.nome);

        System.out.println();

        System.out.println(carro02.ano);
        System.out.println(carro02.modelo);
        System.out.println(carro02.nome);
    }
}
