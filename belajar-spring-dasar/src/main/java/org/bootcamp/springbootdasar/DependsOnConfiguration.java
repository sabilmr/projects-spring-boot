package org.bootcamp.springbootdasar;

import lombok.extern.slf4j.Slf4j;
import org.bootcamp.springbootdasar.data.Bar;
import org.bootcamp.springbootdasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo(){
        log.info("Create new foo");
        return new Foo();
    }

    // secara default tidak ada yng tergantung sama sekali karna Foo bikin sendiri Bar bikin sendiri
    @Bean
    public Bar bar(){
        log.info("Create new bar");
        return new Bar();
    }
}
