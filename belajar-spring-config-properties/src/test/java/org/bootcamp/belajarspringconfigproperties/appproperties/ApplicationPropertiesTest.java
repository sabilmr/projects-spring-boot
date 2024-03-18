package org.bootcamp.belajarspringconfigproperties.appproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest(classes = ApplicationPropertiesTest.TestApplication.class)
public class ApplicationPropertiesTest {

    // saat kita membuat project spring menggunakan start.spring io secara otomatis terdapat sebuah file application properties
    // file ini adalah pusat dari file properties atau konfigurasi aplikasi spring yang kita buat
    // secara default inti dari konfigurasi yang ada di dalam spring itu di simpan dalam file yang namanya application properties
    // secara otomatis, spring boot akan membaca konfigurasi yang kita massukkan ke dalam file apllication properties

    @Autowired
    private Environment environment;

    @Test
    void testApplicationProperties() {
        String property = environment.getProperty("spring.application.name");
        Assertions.assertEquals("Belajar Spring Boot", property);
    }

    @SpringBootApplication
    public static class TestApplication {

    }
}
