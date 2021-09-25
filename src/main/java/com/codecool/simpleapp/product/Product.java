package com.codecool.simpleapp.product;

import java.math.BigDecimal;

public class Product {
    private ProductName name;
    private BigDecimal price;
    private String description;
    private Category category;

    private Product(){

    }

    public static Product of(String name){
        ProductName productName = ProductName.of(name);
        Product product = new Product();
        product.name = productName;

        return product;
    }

    public Product changeName(String name){
        this.name = ProductName.of(name);
        return this;
    }


    public ProductName getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }
}
