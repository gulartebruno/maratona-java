package com.bruno.javacore.Hheranca.test;

import com.bruno.javacore.Hheranca.dominio.Endereco;
import com.bruno.javacore.Hheranca.dominio.Funcionario;
import com.bruno.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("01234567");
        endereco.setRua("Rua 8");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu", "1111111", endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunga", "22222222", endereco, 2000000);

        System.out.println("------------");

        funcionario.imprime();

        funcionario.relatorioPagamento();
    }
}
