package com.bruno.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;

        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Ainda não doar";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
