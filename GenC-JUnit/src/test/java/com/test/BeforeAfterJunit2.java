package com.test;

import org.junit.*;

public class BeforeAfterJunit2 {

    @BeforeClass
    public static void setupBeforeAll() {
        System.out.println("Executed once before all tests");
    }

    @Before
    public void setupBeforeEach() {
        System.out.println("Executed before each test");
    }

    @Test
    public void testGetMethod() {

    }

    @Test
    // @Ignore("This test is disabled and won't run")
    public void testExample2() {
        System.out.println("This won't be printed");
    }

    @Test
    public void testExample3() {
        System.out.println("Executing test 3");
        Assert.assertEquals(5, 2 + 3);
    }

    @After
    public void teardownAfterEach() {
        System.out.println("Executed after each test");
    }

    @AfterClass
    public static void teardownAfterAll() {
        System.out.println("Executed once after all tests");
    }

}