package org.bootcamp.springbootdasar.processor;

import lombok.extern.slf4j.Slf4j;
import org.bootcamp.springbootdasar.aware.IdAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.UUID;
@Slf4j
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id Generator Processor For Bean {}", beanName);
        if (bean instanceof IdAware){

            log.info("Set Id Generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }
        return bean;
    }
}
