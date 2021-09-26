package com.codecool.simpleapp.optional;

import com.codecool.simpleapp.product.Product;

import java.util.Optional;

public class OptionalSimulation {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();

        Optional<Product> productOptional = productRepository.getProduct(1);

        if(productOptional.isPresent()){
            System.out.println(productOptional.get().getCategory());
        }

        Product product = productOptional.orElseThrow();
    }
}
