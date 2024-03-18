package org.bootcamp.springbootdasar.service;

import lombok.Getter;
import org.bootcamp.springbootdasar.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    @Autowired
    private CustomerRepository normalCustomerRepository;

    @Getter
    @Autowired
    private CustomerRepository premiumNormalCustomerRepository;

}
