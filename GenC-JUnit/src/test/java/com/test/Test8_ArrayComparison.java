package com.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class Test8_ArrayComparison {

    @Test
    public void testArrayEquality() {
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] actualArray = {1, 2, 3, 4, 5};

        // Compare the arrays
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testArrayInequality() {
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] actualArray = {1, 2, 3, 4, 6};

        // This will fail because the arrays are not the same
        assertNotEquals(expectedArray, actualArray);
    }
}
