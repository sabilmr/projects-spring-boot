package org.bootcamp.springbootdasar.configuration;

import org.bootcamp.springbootdasar.data.Foo;
import org.springframework.context.annotation.Bean;

public class FooConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }
}
