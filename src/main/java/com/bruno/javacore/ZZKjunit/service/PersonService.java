package com.bruno.javacore.ZZKjunit.service;

import com.bruno.javacore.ZZKjunit.dominio.Person;

import java.util.Objects;

public class PersonService {
    public static boolean isAdult(Person person){
        Objects.requireNonNull(person, "Person can't be null");
        return person.getAge() >= 18;
    }
}
