package org.bootcamp.belajarspringconfigproperties.springbootmessagesource;

import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

import java.util.Locale;

@SpringBootTest(classes = SpringBootMessageSourceTest.TestApplication.class)
public class SpringBootMessageSourceTest {

    @Autowired
    private TestApplication.SampleSource sampleSource;

    @Test
    void testHelloSabil() {
        Assertions.assertEquals("Hello Sabil", sampleSource.helloSabil(Locale.ENGLISH));
        Assertions.assertEquals("Hallo Sabil", sampleSource.helloSabil(new Locale("in_ID")));
    }

    @SpringBootApplication
    public static class TestApplication {

        @Component
        public static class SampleSource implements MessageSourceAware {

            @Setter
            private MessageSource messageSource;

            public String helloSabil(Locale locale) {
                return messageSource.getMessage("hello", new Object[]{"Sabil"}, locale);
            }
        }
    }
}
