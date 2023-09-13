package com.bruno.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semna
        //Considerando 1 como domingo
        byte dia = 1;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                System.out.println("Final de Semana");
                break;
            case 7:
                System.out.println("Sábado");
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Segunda");
                System.out.println("Dia Útil");
                break;
            case 3:
                System.out.println("Terça");
                System.out.println("Dia Útil");
                break;
            case 4:
                System.out.println("Quarta");
                System.out.println("Dia Útil");
                break;
            case 5:
                System.out.println("Quinta");
                System.out.println("Dia Útil");
                break;
            case 6:
                System.out.println("Sexta");
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
