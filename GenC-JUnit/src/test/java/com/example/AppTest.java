package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testApp() {
        App app = new App();
        String expected = "Hello, World!";
        String actual = app.getGreeting();
        assertEquals(expected, actual);
    }
}