package org.gentaracomunity.belajarspringlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class LoggingTest {
    // spring logging sebenernya tidak memiliki fitur khusus untuk logging
    // spring menggunakan library logging yng sudah tersedia di java
    // secara default spring menggunakan library logback untuk melakukan logging
    // namun spring boot memiliki fitur tambahan untuk mempermudah kita, ketika akan menggunakan logging di spring


    @Test
    void testLog(){
        log.info("Belajar Java");
        log.warn("Belajar Spring");
        log.error("Belajar Spring Boot Logging");
    }

    @Test
    void testLongLogging(){
        for (int i = 0; i < 100_000; i++){
            log.warn("Hello World {}", i);
        }
    }

    // saat kita menggunakan spring boot, secara default, spring boot sudah memiliki setting atau pengaturan default untuk logging
    // secara default spring boot melakukan logging ke console dan selain itu spring boot juga memiliki log format
}
