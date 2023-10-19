package com.bruno.javacore.Npolimorfismo.test;

import com.bruno.javacore.Npolimorfismo.dominio.Computador;
import com.bruno.javacore.Npolimorfismo.dominio.Produto;
import com.bruno.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------");

        Produto produto2 = new Tomate("Americano", 10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }

    public static void CalcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto:" + produto.getNome());
        System.out.println("Preço:" + produto.getValor());
        System.out.println("Imposto a ser pago:" + produto.calcularImposto());
    }

}
