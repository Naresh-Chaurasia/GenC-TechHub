package com.json.store;

import com.jayway.jsonpath.JsonPath;
import java.util.List;

public class SimpleJsonExample4 {
    public static void main(String[] args) {
        String json = "{ \"store\": { \"book\": [ { \"title\": \"Book A\", \"author\": \"Author 1\", \"price\": 9.99 }, { \"title\": \"Book B\", \"author\": \"Author 2\", \"price\": 12.99 } ], \"stationery\": { \"item\": \"Pen\", \"price\": 1.5 } } }";

        // Extract books with price greater than 10
        List<Object> expensiveBooks = JsonPath.parse(json).read("$.store.book[?(@.price > 10)]");

        System.out.println("Expensive Books: " + expensiveBooks);
    }
}