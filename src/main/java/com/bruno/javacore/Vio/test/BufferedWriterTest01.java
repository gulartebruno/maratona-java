package com.bruno.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter br = new BufferedWriter(fw)) {

             br.write("Escrevendo dentro de um file Continuando na linha de baixo");
             br.newLine();
             br.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}