package com.mocking;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.mockito.Mockito.*;

class ListMocksTest {

    @Test
    void testMultipleListMocks() {
        // Create 5 mocks of the List interface
        List<String> mockList1 = mock(List.class);
        List<Integer> mockList2 = mock(List.class);
        List<Double> mockList3 = mock(List.class);
        List<Boolean> mockList4 = mock(List.class);
        List<Object> mockList5 = mock(List.class);

        // Define behavior for the mocks
        when(mockList1.get(0)).thenReturn("Mocked String");
        when(mockList2.get(0)).thenReturn(42);
        when(mockList3.get(0)).thenReturn(3.14);
        when(mockList4.get(0)).thenReturn(true);
        when(mockList5.get(0)).thenReturn(new Object());

        // Use the mocks
        System.out.println(mockList1.get(0)); // Output: Mocked String
        System.out.println(mockList2.get(0)); // Output: 42
        System.out.println(mockList3.get(0)); // Output: 3.14
        System.out.println(mockList4.get(0)); // Output: true
        System.out.println(mockList5.get(0)); // Output: java.lang.Object@<hashcode>

        // Verify interactions with the mocks
        verify(mockList1).get(0);
        verify(mockList2).get(0);
        verify(mockList3).get(0);
        verify(mockList4).get(0);
        verify(mockList5).get(0);
    }
}