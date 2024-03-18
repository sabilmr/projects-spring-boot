package org.bootcamp.springbootdasar;

import lombok.extern.slf4j.Slf4j;
import org.bootcamp.springbootdasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
@Slf4j
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Create new foo");
        return new Foo();
    }
}
