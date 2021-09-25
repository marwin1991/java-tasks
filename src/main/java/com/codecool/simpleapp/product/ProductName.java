package com.codecool.simpleapp.product;

import org.apache.commons.lang3.StringUtils;

class ProductName {
    private final String name;

    private ProductName(String name) {
        this.name = name;
    }

    public static ProductName of(String name){
        if(StringUtils.isNotBlank(name)){
            return new ProductName(name);
        } else {
            throw new RuntimeException();
        }
    }


}
