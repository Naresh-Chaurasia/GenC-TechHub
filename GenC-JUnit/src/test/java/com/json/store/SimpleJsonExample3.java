package com.json.store;

import com.jayway.jsonpath.JsonPath;

public class SimpleJsonExample3 {
    public static void main(String[] args) {
        String json = "{ \"store\": { \"book\": [ { \"title\": \"Book A\", \"author\": \"Author 1\", \"price\": 9.99 }, { \"title\": \"Book B\", \"author\": \"Author 2\", \"price\": 12.99 } ], \"stationery\": { \"item\": \"Pen\", \"price\": 1.5 } } }";

        // Extract the price of the pen
        double penPrice = JsonPath.parse(json).read("$.store.stationery.price");

        System.out.println("Pen Price: " + penPrice);
    }
}