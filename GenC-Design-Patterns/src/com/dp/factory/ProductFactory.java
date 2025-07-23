package com.dp.factory;

public class ProductFactory {

    public static Product getProduct(String type) {
        if (type.equalsIgnoreCase("book")) {
            return new Book();
        } else {
            return new Pen();
        } 
        
    }

}
