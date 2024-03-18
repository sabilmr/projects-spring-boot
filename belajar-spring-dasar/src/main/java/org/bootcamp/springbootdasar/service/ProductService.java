package org.bootcamp.springbootdasar.service;

import lombok.Getter;
import lombok.Setter;
import org.bootcamp.springbootdasar.repository.ProductRepository;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
