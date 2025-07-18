package com.mocking;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    @Test
    void testSortNumbers() {
        // Mock the DataRepository
        DataRepository mockDataRepository = mock(DataRepository.class);

        // Define behavior for the mock
        when(mockDataRepository.fetchData()).thenReturn(new int[] { 5, 3, 8, 1 });

        // Inject the mock into SortService
        SortService sortService = new SortService(mockDataRepository);

        // Call the method to test
        int[] sortedNumbers = sortService.sortNumbers();

        // Verify the result
        assertArrayEquals(new int[] { 1, 3, 5, 8 }, sortedNumbers);

        // Verify interaction with the mock
        verify(mockDataRepository).fetchData();
        System.out.println("Mocking Done...");
    }
}