package com.bruno.javacore.Oexception.runtimetest;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {
        divisao(1, 0);
        System.out.println("Código finalizado!");
    }

    private static int divisao(int a, int b) {
        if (b==0){
            throw new IllegalArgumentException("Argumento inválido, divisão por 0 impossível!");
        }
        return a/b;

    }
}
