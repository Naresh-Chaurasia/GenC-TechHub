package com.test;

import org.junit.Test;

public class Junit12_Exception {

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        int result = 10 / 0;  // This will throw an ArithmeticException
    }
}
