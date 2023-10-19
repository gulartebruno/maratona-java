package com.bruno.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 12;
        while (count < 10) {
            System.out.println(++count);

        }
        do {
            System.out.println("dentro do do-while");
        } while (count < 10);
        {

        }
        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
