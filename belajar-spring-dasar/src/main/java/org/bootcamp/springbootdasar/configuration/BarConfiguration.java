package org.bootcamp.springbootdasar.configuration;

import org.bootcamp.springbootdasar.data.Bar;
import org.springframework.context.annotation.Bean;

public class BarConfiguration {

    @Bean
    public Bar bar(){
        return new Bar();
    }
}
