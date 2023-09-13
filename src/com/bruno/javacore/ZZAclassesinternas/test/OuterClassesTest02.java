package com.bruno.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    void print(String param) {
        String lastName = "Izuku";
        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(name+" " + lastName);
            }
        }
        new LocalClass().printLocal();

    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();

    }
}
