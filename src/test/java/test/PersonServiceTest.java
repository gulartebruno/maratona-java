package test;

import com.bruno.javacore.ZZKjunit.dominio.Person;
import com.bruno.javacore.ZZKjunit.service.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonServiceTest {
    @DisplayName("A person should not be adult when age is lower than 18")
    @Test
    void isAdult() {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        Assertions.assertFalse(personService.isAdult(person));
    }
    @DisplayName("A person should be adult when age is grater or equal than 18")
    @Test
    void isMinor() {
        Person person = new Person(21);
        PersonService personService = new PersonService();
        Assertions.assertTrue(personService.isAdult(person));
    }
}