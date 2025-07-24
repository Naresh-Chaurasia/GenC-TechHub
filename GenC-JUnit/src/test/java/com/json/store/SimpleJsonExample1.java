package com.json.store;

import com.jayway.jsonpath.JsonPath;

public class SimpleJsonExample1 {
    public static void main(String[] args) {
        String json = "{ \"store\": { \"book\": [ { \"title\": \"Book A\", \"author\": \"Author 1\", \"price\": 9.99 }, { \"title\": \"Book B\", \"author\": \"Author 2\", \"price\": 12.99 } ], \"stationery\": { \"item\": \"Pen\", \"price\": 1.5 } } }";

        // Extract the title of the first book
        String firstBookTitle = JsonPath.parse(json).read("$.store.book[0].title");

        System.out.println("First Book Title: " + firstBookTitle);
    }
}