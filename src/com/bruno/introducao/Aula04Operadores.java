package com.bruno.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +-/*
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(resultado);

        //Operadores lógicos

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        //<> <= >=

        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualQueVinte = 10==20;
        boolean isDezIgualQueDez = 10==10;
        boolean isDezDiferenteQueDez = 10!=10;
        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+ isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez "+ isDezIgualQueDez);
        System.out.println("isDezDiferenteQueDez "+ isDezDiferenteQueDez);

        // && (AND) || (or) ! (not)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean  isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

         double valorTotalContaCorrente = 200;
         double valorTotalContaPoupança = 10000;
         float valorPlaystation = 5000F;
         boolean isPlaystationCincoCompravel = (valorTotalContaCorrente > valorPlaystation) || (valorTotalContaPoupança > valorPlaystation);

         // = += -= *= /= %=
        double bonus = 1800;
        bonus += + 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //

        int contador = 0;
        contador += 1;      //contador = contador + 1;
        contador ++;
        contador--;
        ++contador;

        int cotador2 = 0;
        System.out.println(contador);

    }
}
