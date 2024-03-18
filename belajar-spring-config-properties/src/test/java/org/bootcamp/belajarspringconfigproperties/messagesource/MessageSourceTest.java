package org.bootcamp.belajarspringconfigproperties.messagesource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

public class MessageSourceTest {
    private ApplicationContext applicationContext;
    private MessageSource messageSource;

    // spring yang memiliki fitur yang bernama message source yaitu untuk mengambil pesan dari sumbernya

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestApplication.class);
        messageSource = applicationContext.getBean(MessageSource.class);
    }

    @Test
    void testDefaultLocal() {
        String message = messageSource.getMessage("hello", new Object[]{"Sabil"}, Locale.ENGLISH);
        Assertions.assertEquals("Hello Sabil", message);
    }

    @Test
    void testIndonesiaLocal() {
        String message = messageSource.getMessage("hello", new Object[]{"Sabil"}, new Locale("in_ID"));
        Assertions.assertEquals("Hallo Sabil", message);
    }

    @SpringBootApplication
    public static class TestApplication {

        @Bean
        public MessageSource messageSource(){
            ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
            messageSource.setBasenames("my");
            return messageSource;
        }
    }
}
