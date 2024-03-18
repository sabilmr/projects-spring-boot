package org.bootcamp.springbootdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DatabaseTest {

    @Test
    void testCreateDatabase() {

        ApplicationContext context = new AnnotationConfigApplicationContext(Database.class);

        Assertions.assertNotNull(context);
    }

}
