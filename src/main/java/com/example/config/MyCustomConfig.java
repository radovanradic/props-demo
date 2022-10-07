package com.example.config;

import io.micronaut.context.annotation.EachProperty;

@EachProperty(value = "my.config.custom-configs", list = true)
public class MyCustomConfig {

    private String name;

    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
