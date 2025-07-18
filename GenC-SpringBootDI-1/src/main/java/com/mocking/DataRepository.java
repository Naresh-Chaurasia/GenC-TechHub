package com.mocking;

import org.springframework.stereotype.Repository;

@Repository
public class DataRepository {

    public int[] fetchData() {
        // Simulating fetching data from a database
        return new int[] { 5, 3, 8, 1, 2 };
    }
}
