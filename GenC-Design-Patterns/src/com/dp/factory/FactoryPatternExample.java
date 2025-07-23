package com.dp.factory;

public class FactoryPatternExample {
    public static void main(String[] args) {
        Product p1 = ProductFactory.getProduct("book");
        p1.use();

        Product p2 = ProductFactory.getProduct("pen");
        p2.use();
    }
}
