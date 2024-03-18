package org.bootcamp.springbootdasar;

import org.bootcamp.springbootdasar.configuration.BarConfiguration;
import org.bootcamp.springbootdasar.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
