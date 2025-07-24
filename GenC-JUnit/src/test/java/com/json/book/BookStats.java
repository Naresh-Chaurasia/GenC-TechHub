package com.json.book;

import com.jayway.jsonpath.JsonPath;
import java.util.List;
import java.util.Collections;

public class BookStats {
    public static void main(String[] args) {
        String json = """
                {
                    "store": {
                        "book": [
                            { "title": "Book A", "price": 9.99 },
                            { "title": "Book B", "price": 12.99 },
                            { "title": "Book C", "price": 7.99 }
                        ]
                    }
                }
                """;

        // Get the count of books
        int bookCount = JsonPath.parse(json).read("$.store.book.length()");
        System.out.println("Number of Books: " + bookCount);

        // Extract all book prices
        List<Double> prices = JsonPath.parse(json).read("$.store.book[*].price");

    }
}
