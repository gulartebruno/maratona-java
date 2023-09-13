package com.bruno.javacore.Npolimorfismo.test;

import com.bruno.javacore.Npolimorfismo.dominio.Computador;
import com.bruno.javacore.Npolimorfismo.dominio.Televisao;
import com.bruno.javacore.Npolimorfismo.dominio.Tomate;
import com.bruno.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC 10", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\"", 5000);
        CalculadoraImposto.CalcularImposto(computador);
        System.out.println("---------------------");
        CalculadoraImposto.CalcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.CalcularImposto(tv);
    }
}
