package org.bootcamp.springbootdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "org.bootcamp.springbootdasar.service"
})
public class ComponentConfiguration {
}
