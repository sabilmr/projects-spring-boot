package org.bootcamp.belajarspringconfigproperties.configurationapplication;

import org.bootcamp.belajarspringconfigproperties.converter.StringToDateConverter;
import org.bootcamp.belajarspringconfigproperties.properties.ApplicationProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.core.convert.ConversionService;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;

@SpringBootTest(classes = ConfigurationApplicationTest.TestApplication.class)
public class ConfigurationApplicationTest {

    // binding adalah menyamakan data dari satu tempat ke tempat yang lain dimana disini configuration properties menyamakan data
    // yang ada di dalam application properties kita ke dalam property yang ada di dalam bean spring boot nya

    @Autowired
    private ApplicationProperties properties;

    @Autowired
    private ConversionService conversionService;

    @Test
    void testConversionService() {
        Assertions.assertTrue(conversionService.canConvert(String.class, Duration.class));
        Assertions.assertTrue(conversionService.canConvert(String.class, Date.class));

        Duration result = conversionService.convert("10s", Duration.class);
        Assertions.assertEquals(Duration.ofSeconds(10), result);

    }

    @Test
    void testConfigurationApplication() {
        Assertions.assertEquals("Belajar Spring Boot", properties.getName());
        Assertions.assertEquals(1, properties.getVersion());
        Assertions.assertFalse(properties.isProductionMode());
    }

    @Test
    void testDatabaseProperties() {
        Assertions.assertEquals("root", properties.getDatabase().getUsername());
        Assertions.assertEquals("P@ssW0rd32!", properties.getDatabase().getPassword());
        Assertions.assertEquals("belajar", properties.getDatabase().getDatabase());
        Assertions.assertEquals("jdbc:contoh", properties.getDatabase().getUrl());
    }

    @Test
    void testCollectionProperties() {
        Assertions.assertEquals(Arrays.asList("product", "customers", "category"), properties.getDatabase().getWhiteListTables());
        Assertions.assertEquals(100, properties.getDatabase().getMaxTablesSize().get("product"));
        Assertions.assertEquals(100, properties.getDatabase().getMaxTablesSize().get("customers"));
        Assertions.assertEquals(100, properties.getDatabase().getMaxTablesSize().get("category"));
    }

    @Test
    void testEmbeddedCollection() {
        Assertions.assertEquals("default", properties.getDefaultRole().get(0).getId());
        Assertions.assertEquals("Default Role", properties.getDefaultRole().get(0).getName());
        Assertions.assertEquals("guest", properties.getDefaultRole().get(1).getId());
        Assertions.assertEquals("Guest Role", properties.getDefaultRole().get(1).getName());

        Assertions.assertEquals("admin", properties.getRoles().get("admin").getId());
        Assertions.assertEquals("Admin Role", properties.getRoles().get("admin").getName());
        Assertions.assertEquals("finance", properties.getRoles().get("finance").getId());
        Assertions.assertEquals("Finance Role", properties.getRoles().get("finance").getName());
    }

    @Test
    void testDuration() {
        Assertions.assertEquals(Duration.ofSeconds(10), properties.getDefaultTimeout());

    }

    @Test
    void testCustomConverter() {
        Date dateExpire = properties.getExpireDate();

        var dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Assertions.assertEquals("2024-02-26", dateFormat.format(dateExpire));
    }

    @SpringBootApplication
    @EnableConfigurationProperties({
            ApplicationProperties.class
    })
    @Import(StringToDateConverter.class)
    public static class TestApplication {

        @Bean
        public ConversionService conversionService(StringToDateConverter stringToDateConverter){
            ApplicationConversionService conversionService = new ApplicationConversionService();
            conversionService.addConverter(stringToDateConverter);
            return conversionService;
        }

    }
}
