package com.dp.singleton;

public class SimpleSingleton {

    // Step 1: Create a private static instance of the class
    private static final SimpleSingleton instance = new SimpleSingleton();

    // Step 2: Make the constructor private so no other class can instantiate it
    private SimpleSingleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Provide a public static method to get the instance
    public static SimpleSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    // Main method to test the Singleton
    public static void main(String[] args) {
        SimpleSingleton obj1 = SimpleSingleton.getInstance();
        SimpleSingleton obj2 = SimpleSingleton.getInstance();

        obj1.showMessage();

        // Check if both references point to the same instance
        System.out.println("Are both objects same? " + (obj1 == obj2));
    }
}