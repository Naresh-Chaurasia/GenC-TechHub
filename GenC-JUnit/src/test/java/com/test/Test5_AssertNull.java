package com.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class Test5_AssertNull {

    @Test
    public void testNotNullObject() {
        String str = "NC";
        assertNull(str);
    }
}
