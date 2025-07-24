package com.test;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class Test3_AssertFalse {

    @Test
    public void testNegativeNumber() {
        int number = -10;
        assertFalse(number > 0);
    }
}