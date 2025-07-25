package com.test;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//Test for Equality Assertion
public class Test1_AssertEqual {


    public void testAddition_NoTest() {
        int expected = 5;
        int actual = 2 + 3;

        // Asserting that expected is equal to actual
        assertEquals(expected, actual);
    }



    @Test
    public void testAddition() {
        int expected = 5;
        int actual = 2 + 3;

        // Asserting that expected is equal to actual
        assertEquals(expected, actual);
    }


    @Test
    public void testPositiveNumber() {
        int number = 100;
        assertTrue(number > 20);
    }
}
