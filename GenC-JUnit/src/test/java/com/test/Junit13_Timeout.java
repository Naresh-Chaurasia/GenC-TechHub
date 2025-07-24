package com.test;

import org.junit.Test;

public class Junit13_Timeout {

    @Test(timeout = 1000)  // Test will fail if it runs longer than 1000 milliseconds (1 second)
    public void testWithTimeout() throws InterruptedException {
        // Simulate long-running operation
        Thread.sleep(500);  // Sleep for 500 milliseconds (within the timeout)
        // Call API, and it should return response in 500 Millisec.
    }

    @Test(timeout = 1000)  // This test will fail as it exceeds the timeout
    public void testExceedingTimeout() throws InterruptedException {
        // Simulate longer operation
        Thread.sleep(1500);  // Sleep for 1500 milliseconds (exceeds the timeout)
    }
}
