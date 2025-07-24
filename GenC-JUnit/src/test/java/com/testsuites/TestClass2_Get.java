package com.testsuites;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestClass2_Get {

    @Test
    public void testMethod2() {

        System.out.print("TestClass2_Get");
        assertTrue("String is not empty", !"JUnit".isEmpty());
    }
}
