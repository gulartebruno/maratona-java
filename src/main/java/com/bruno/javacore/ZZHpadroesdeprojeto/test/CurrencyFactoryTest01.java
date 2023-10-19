package com.bruno.javacore.ZZHpadroesdeprojeto.test;

import com.bruno.javacore.ZZHpadroesdeprojeto.dominio.Country;
import com.bruno.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import com.bruno.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
