package com.bruno.javacore.Npolimorfismo.servico;

import com.bruno.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em Memória");
    }
}
