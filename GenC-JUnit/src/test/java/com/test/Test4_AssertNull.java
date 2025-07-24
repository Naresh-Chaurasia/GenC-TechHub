package com.test;


import static org.junit.Assert.assertNull;
import org.junit.Test;

public class Test4_AssertNull {

    @Test
    public void testNullObject() {
        String str = null;
        assertNull(str);
    }
}