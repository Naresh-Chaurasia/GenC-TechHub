package com.dp.singleton;

public class Car {

    static Car c = new Car();
    int a = 10;

    private Car() {
        // Private constructor to prevent instantiation
    }

    public static Car getInstance() {
        return c;
    }
}
