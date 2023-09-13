package com.bruno.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Exclui todos os caracteres em branco
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo o que não for incluso no \w
        // [] =
        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        //String texto = "abababa";
        String texto = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " +texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encotradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);

    }
}
