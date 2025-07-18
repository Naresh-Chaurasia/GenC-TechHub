package com.mocking;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Test2 {

    @Test
    public void testArrayEquality() {
        int[] expectedArray = { 1, 2, 3, 4, 5 };
        int[] actualArray = { 1, 2, 3, 4, 5 };

        // Compare the arrays
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testArrayListEquality() {
        ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        ArrayList<String> actualList = new ArrayList<String>(Arrays.asList("A", "B", "C1"));

        // Compare the ArrayLists
        assertEquals(expectedList, actualList);
    }

}
