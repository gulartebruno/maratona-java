package com.bruno.javacore.Zgenereics.test;

import com.bruno.javacore.Zgenereics.dominio.Barco;
import com.bruno.javacore.Zgenereics.dominio.Carro;
import com.bruno.javacore.Zgenereics.service.BarcoRentavelService;
import com.bruno.javacore.Zgenereics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
