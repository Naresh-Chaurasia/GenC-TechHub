package com.dp.singleton;

public class EmployeeCreation {

    public static void main(String[] args) {
        Employee e1 = Employee.createEmployee();
        Employee e2 = Employee.createEmployee();

        System.out.println(e1);
        System.out.println(e2);
    }

}
