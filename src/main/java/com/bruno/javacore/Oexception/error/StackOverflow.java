package com.bruno.javacore.Oexception.error;

public class StackOverflow {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
