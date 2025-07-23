package com.dp.singleton;

public class Employee {
    private Employee() {
        // Constructor logic for Employee
        System.out.println("Employee created");
    }

    public static Employee createEmployee() {

        // Logic to create an employee
        System.out.println("Creating employee...");

        return new Employee();
    }
}
