package org.gentaracomunity.belajarspringvalidation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.gentaracomunity.belajarspringvalidation.data.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest
public class ValidatorTest {
    // jika menggunakan spring boot di integasikan dengan bean validation secara otomatis kita bisa pakai object Validatornya tidak perlu membuat manual
    // intregasi adalah proses untuk menyatukan berbagai kelompok

    @Autowired
    private Validator validator;

    @Test
    void personNotValid(){
        var person = new Person("", "");

        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(2, constraintViolations.size());
    }

    @Test
    void personValid(){
        var person = new Person("1", "Sabilla");

        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);
        Assertions.assertTrue(constraintViolations.isEmpty());
    }
}

