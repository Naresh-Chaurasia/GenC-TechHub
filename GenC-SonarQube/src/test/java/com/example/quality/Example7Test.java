
package com.example.quality;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Example7Test {

    @Test
    void testMultiply() {
        Example7 ex = new Example7();
        assertEquals(6, ex.multiply(2, 3));
    }
}
