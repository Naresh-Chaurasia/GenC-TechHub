package com.testing;

import org.junit.Test;

public class CalculatorTestFailing {
    @Test
    public void testAdd() {
        throw new RuntimeException("testAdd is failing intentionally");
    }

    @Test
    public void testSubtract() {
        throw new RuntimeException("testSubtract is failing intentionally");
    }

    @Test
    public void testMultiply() {
        throw new RuntimeException("testMultiply is failing intentionally");
    }
}
