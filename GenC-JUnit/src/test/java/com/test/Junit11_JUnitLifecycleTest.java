package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit11_JUnitLifecycleTest {

    // Method executed once before all tests (must be static)
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Before all tests - @BeforeClass");
    }

    // Method executed once after all tests (must be static)
    @AfterClass
    public static void afterAllTests() {
        System.out.println("After all tests - @AfterClass");
    }

    // Method executed before each test
    @Before
    public void beforeEachTest() {
        System.out.println("Before each test - @Before");
    }

    // Method executed after each test
    @After
    public void afterEachTest() {
        System.out.println("After each test - @After");
    }

    // Sample test case 1
    @Test
    public void test1() {
        System.out.println("Executing test 1");
    }


    // Sample test case 2
    @Test
    public void test2() {
        System.out.println("Executing test 2");
    }

    // Sample test case 2
    @Test
    public void test3() {
        System.out.println("Executing test 3");
    }
}
