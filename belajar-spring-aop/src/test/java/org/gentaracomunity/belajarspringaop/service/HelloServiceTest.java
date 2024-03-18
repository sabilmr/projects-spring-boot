package org.gentaracomunity.belajarspringaop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void testHelloService() {
        Assertions.assertEquals("Hello Sabilla", helloService.hello("Sabilla"));
        Assertions.assertEquals("Bye Sabilla", helloService.bye("Sabilla"));
    }
}
