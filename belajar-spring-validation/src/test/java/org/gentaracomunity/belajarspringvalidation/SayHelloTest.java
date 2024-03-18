package org.gentaracomunity.belajarspringvalidation;

import jakarta.validation.ConstraintViolationException;
import org.gentaracomunity.belajarspringvalidation.data.helper.SayHello;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SayHelloTest {

    @Autowired
    private SayHello sayHello;

    @Test
    void testSuccess() {
        String message = sayHello.sayHello("Sabil");
        Assertions.assertEquals("Hello Sabil", message);
    }

    @Test
    void testFailed() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
            sayHello.sayHello("");
        });
    }
}
