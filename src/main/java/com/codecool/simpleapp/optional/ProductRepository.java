package com.codecool.simpleapp.optional;

import com.codecool.simpleapp.product.Product;

import java.util.Optional;

public class ProductRepository {

    public Optional<Product> getProduct(int id){
        try {
            return Optional.of(Product.of("ala"));
        } catch (Exception e){
            return Optional.empty();
        }
    }
}
