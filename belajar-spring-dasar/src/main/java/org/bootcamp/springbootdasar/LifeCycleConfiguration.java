package org.bootcamp.springbootdasar;

import org.bootcamp.springbootdasar.data.Conection;
import org.bootcamp.springbootdasar.data.Server;
import org.springframework.context.annotation.Bean;

public class LifeCycleConfiguration {

    @Bean
    public Conection conection(){
        return new Conection();
    }

    // initMethod adalah mengekskusi dan destroyMethod adalah mengshow down
   // @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server(){
        return new Server();
    }
}
