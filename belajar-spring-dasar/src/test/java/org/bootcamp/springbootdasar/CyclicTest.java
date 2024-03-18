package org.bootcamp.springbootdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.codec.ClientCodecConfigurer;

public class CyclicTest {

    @Test
    void testCyclic() {

        Assertions.assertThrows(Throwable.class, () -> {
            ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
        });
    }

    // hati-hati dengan circular dependency

    // circular dependency adalah kasus dimana sebuah lingkaran dependency terjadi, misal bean A membutuhkan bean b,
    // bean b membutuhkan bean c dan ternyata bean c membutuhkan bean a

    // jika terjadi cyclic seperti ini, secara otomatis spring akan mendeteksinya, dan akan menganggapnya bahwa itu adalah error

    @Test
    void testClick() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
    }
}
