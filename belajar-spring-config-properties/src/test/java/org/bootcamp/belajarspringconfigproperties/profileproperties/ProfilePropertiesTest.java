package org.bootcamp.belajarspringconfigproperties.profileproperties;

import lombok.Getter;
import org.bootcamp.belajarspringconfigproperties.appproperties.ApplicationPropertiesTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ApplicationPropertiesTest.TestApplication.class)
@ActiveProfiles({"production", "test"})
public class ProfilePropertiesTest {

    // kalau mengaktifkan profile itu dia akan otomatis dia akan mencari application properties sesuai dengan profilenya otomatis datanya di ambil dari sana

    @Autowired
    private TestApplication.ProfileProperties properties;

    @Test
    void testProfileProperties() {
        Assertions.assertEquals("Default", properties.getDefaultFile());
        Assertions.assertEquals("Production", properties.getProductionFile());
        Assertions.assertEquals("Test", properties.getTestFile());
    }

    @SpringBootApplication
    public static class TestApplication {
        @Getter
        @Component
        public static class ProfileProperties {

            @Value("${spring.profiles.default}")
            private String defaultFile;

            @Value("${profiles.production}")
            private String productionFile;

            @Value("${profiles.test}")
            private String testFile;

        }
    }
}
