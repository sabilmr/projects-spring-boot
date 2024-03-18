package org.bootcamp.springbootdasar;

import lombok.extern.slf4j.Slf4j;
import org.bootcamp.springbootdasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    // apa itu bean yaitu object yng dimasukkan kedalam spring container
    // jadi secara default saat kita membuat bean didalam spring itu defaultnya adalah singgleton
    
    // container adalah sofware yang digunakan untuk mempermudah pengembangan aplikasi
    // dengan cara mengemas dan mengisolasi suatu aplikasi secara virtual.
    // Virtual adalah bentuk komunikasi langsung tanpa bertemu secara nyata, hanya mirip seperti nyata.
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Create new foo");
        return foo;
    }
}
