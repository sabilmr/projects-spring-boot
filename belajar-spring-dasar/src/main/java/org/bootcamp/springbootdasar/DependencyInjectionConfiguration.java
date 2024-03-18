package org.bootcamp.springbootdasar;

import org.bootcamp.springbootdasar.data.Bar;
import org.bootcamp.springbootdasar.data.Foo;
import org.bootcamp.springbootdasar.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo fooFirst(){
        return new Foo();
    }

    @Bean
    public Foo fooSecond(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    // jadi nanti spring akan mencari semua parameter yng ada di method bean foobar
    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
