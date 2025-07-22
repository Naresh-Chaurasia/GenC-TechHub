package com.mocking;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class BasicMockingTest {
    @Test
    void testBasicMocking() {
        // Create a mock
        MyService mockService = mock(MyService.class);

        // Define behavior
        when(mockService.getData()).thenReturn("Mocked Data");

        // Use the mock
        // System.out.println("----------");
        System.out.println(mockService.getData()); // Output: Mocked Data

        // Verify interaction
        // This line is verifying that the getData() method was called exactly once on
        // the mockService object during the test execution.
        verify(mockService).getData();
    }

    interface MyService {
        String getData();
    }

}