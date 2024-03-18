package org.bootcamp.springbootdasar;

import org.bootcamp.springbootdasar.data.Conection;
import org.bootcamp.springbootdasar.data.Server;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void lifeCycleTest() {
        Conection bean = applicationContext.getBean(Conection.class);
    }

    @Test
    void serverTest() {
        Server server = applicationContext.getBean(Server.class);
    }
}
