package com.bruno.javacore.Npolimorfismo.test;

import com.bruno.javacore.Npolimorfismo.dominio.Computador;
import com.bruno.javacore.Npolimorfismo.dominio.Produto;
import com.bruno.javacore.Npolimorfismo.dominio.Tomate;
import com.bruno.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 23);
        tomate.setDataValidade("11/12/2023");


        CalculadoraImposto.CalcularImposto(tomate);



    }
}
