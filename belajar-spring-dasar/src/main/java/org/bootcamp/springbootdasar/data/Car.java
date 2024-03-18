package org.bootcamp.springbootdasar.data;

import lombok.Getter;
import org.bootcamp.springbootdasar.aware.IdAware;
import org.springframework.stereotype.Component;

@Component
public class Car implements IdAware {

    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
