package com.example.jingzehuang.dagger2test.c4;

public class Product {

    private static int NUM = 0;
    private String name;

    public Product() {
        this.name = "Product[" + NUM++ + "]";
    }

    public String getName() {
        return name;
    }
}
