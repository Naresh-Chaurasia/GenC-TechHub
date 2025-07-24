package com.test;


import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class Test9_ArrayListComparison {

    @Test
    public void testArrayListEquality() {
        ArrayList<String> expectedList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> actualList = new ArrayList<>(Arrays.asList("A", "B", "C"));

        // Compare the ArrayLists
        assertEquals(expectedList, actualList);
    }

    @Test
    public void testArrayListInequality() {
        ArrayList<String> expectedList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> actualList = new ArrayList<>(Arrays.asList("A", "B", "D"));

        // This will fail because the lists are not the same
        assertEquals(expectedList, actualList);
    }
}
