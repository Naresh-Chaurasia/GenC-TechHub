package com.testsuites;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClass1_Get {

    @Test
    public void testMethod1() {
        System.out.print("TestClass1_Get");
        assertEquals(5, 2 + 3);
    }

    @Test
    public void testMethod11() {
        System.out.print("TestClass1_Get");
        assertEquals(5, 2 + 3);
    }

    @Test
    @Ignore("This test is ignored and won't run")
    public void testMethod12() {
        System.out.print("TestClass1_Get");
        assertEquals(5, 2 + 3);
    }
}
