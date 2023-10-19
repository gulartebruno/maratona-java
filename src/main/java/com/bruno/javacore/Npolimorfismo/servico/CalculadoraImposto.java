package com.bruno.javacore.Npolimorfismo.servico;

import com.bruno.javacore.Npolimorfismo.dominio.Computador;
import com.bruno.javacore.Npolimorfismo.dominio.Produto;
import com.bruno.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void CalcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto:" + produto.getNome());
        System.out.println("Preço:" + produto.getValor());
        System.out.println("Imposto a ser pago:" + produto.calcularImposto());

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }
}