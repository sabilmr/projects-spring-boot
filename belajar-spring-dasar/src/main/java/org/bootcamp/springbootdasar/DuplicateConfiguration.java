package org.bootcamp.springbootdasar;

import org.bootcamp.springbootdasar.data.Foo;
import org.springframework.context.annotation.Bean;

public class DuplicateConfiguration {

    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
