package com.dp.singleton;

public class MainMethod {
    public static void main(String[] args) {
        // Car c1 = new Car();
        // Car c2 = new Car();

        Car c1 = Car.getInstance();
        Car c2 = Car.getInstance();

        System.out.println(c1);
        System.out.println(c2);

    }

}
