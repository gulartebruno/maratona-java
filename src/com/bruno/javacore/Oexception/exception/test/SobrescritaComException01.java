package com.bruno.javacore.Oexception.exception.test;

import com.bruno.javacore.Oexception.exception.dominio.Funcionario;
import com.bruno.javacore.Oexception.exception.dominio.LoginInvalidoException;
import com.bruno.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComException01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
