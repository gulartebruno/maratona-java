package com.bruno.javacore.Npolimorfismo.test;

import com.bruno.javacore.Npolimorfismo.repositorio.Repositorio;
import com.bruno.javacore.Npolimorfismo.servico.RepositorioArquivo;
import com.bruno.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
