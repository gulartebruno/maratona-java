package com.bruno.javacore.ZZBcomportamento.interfaces;

import com.bruno.javacore.ZZBcomportamento.dominio.Car;

public interface CarPredicate {
    //anonimas, funções, concisa
    boolean test(Car car);
    //(parametro) -> <expressão>
    //(Car car) -> car.getColor().equals("green");
}
