package org.bootcamp.belajarspringconfigproperties.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties("application.properties")
public class ApplicationProperties {

    private Date expireDate;

    private Duration defaultTimeout;

    private String name;

    private Integer version;

    private boolean productionMode;

    private DatabaseApplication database;

    private List<Role> defaultRole;

    private Map<String, Role> roles;

    @Getter
    @Setter
    public static class DatabaseApplication {
        private String username;

        private String password;

        private String database;

        private String url;

        private List<String> whiteListTables;

        private Map<String, Integer> maxTablesSize;

    }

    @Getter
    @Setter
    public static class Role {
        private String id;

        private String name;
    }
}
