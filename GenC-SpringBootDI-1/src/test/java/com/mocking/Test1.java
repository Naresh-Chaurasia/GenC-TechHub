package com.mocking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Test1 {

    @Test
    public void testAdd1() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        assertEquals(30, sum);
    }

    @Test
    public void testAdd2() {
        int expected = 10;
        int actual = 5 + 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testPositiveNumber() {
        int number = 100;
        assertTrue(number > 20);
    }

    @Test
    public void testNegativeNumber() {
        int number = -10;
        assertFalse(number > 0);
    }

    @Test
    public void testNullObject() {
        String str = "hello";
        assertNull(str);
    }

}
