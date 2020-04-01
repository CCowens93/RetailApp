package com.houseawesome.RetailBackend.models.dao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    // https://stackoverflow.com/questions/12496555/java-best-type-to-hold-price
    private BigDecimal price;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
        this.price.setScale(2, RoundingMode.HALF_EVEN);
    }
}
