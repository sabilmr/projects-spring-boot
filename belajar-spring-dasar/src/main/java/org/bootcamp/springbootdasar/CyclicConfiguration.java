package org.bootcamp.springbootdasar;

import org.bootcamp.springbootdasar.cyclic.CyclicA;
import org.bootcamp.springbootdasar.cyclic.CyclicB;
import org.bootcamp.springbootdasar.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;

public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
