package com.test;

import org.junit.*;

public class BeforeAfterJunit {

    @BeforeClass
    public static void setupBeforeAll() {
        System.out.println("Executed once before all tests");
    }


    @Before
    public void setupBeforeEach() {
        System.out.println("Executed before each test");
    }

    @Test
    public void testExample1() {
        System.out.println("Executing test 1");
        Assert.assertTrue(2 > 1);
    }

    @Test
    //@Ignore("This test is disabled and won't run")
    public void testExample2() {
        System.out.println("This won't be printed");
    }


    @After
    public void teardownAfterEach() {
        System.out.println("Executed after each test");
    }


}