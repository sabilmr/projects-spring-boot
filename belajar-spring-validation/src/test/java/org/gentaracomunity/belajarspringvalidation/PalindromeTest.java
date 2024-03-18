package org.gentaracomunity.belajarspringvalidation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.gentaracomunity.belajarspringvalidation.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;
import java.util.Set;

@SpringBootTest
public class PalindromeTest {

    @Autowired
    private Validator validator;

    @Test
    void palindromeValid() {
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("kodok"));
        Assertions.assertTrue(constraintViolations.isEmpty());
    }

    @Test
    void palindromeInvalid() {
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("sabil"));
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(1, constraintViolations.size());
    }

    @Test
    void palindromeInvalidMessage() {
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("sabil"));
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(1, constraintViolations.size());

        String message = Objects.requireNonNull(constraintViolations.stream().findFirst().orElse(null)).getMessage();
        Assertions.assertEquals("Data bukan palindrome", message);
    }
}
