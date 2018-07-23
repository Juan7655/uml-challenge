package com.endava.drodriguez.domainmodel;

public class Product {
    private int sku;
    private String name;
    private String description;

    public Product(int sku, String name, String description) {
        this.sku = sku;
        this.name = name;
        this.description = description;
    }
}
