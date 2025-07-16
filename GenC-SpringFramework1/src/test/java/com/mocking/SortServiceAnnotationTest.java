package com.mocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class SortServiceAnnotationTest {

    @Mock
    private DataRepository mockDataRepository;

    @InjectMocks
    private SortService sortService;

    @BeforeEach
    void setUp() {
        // Initialize mocks
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSortNumbers() {
        // Define behavior for the mock
        when(mockDataRepository.fetchData()).thenReturn(new int[]{5, 3, 8, 1});

        // Call the method to test
        int[] sortedNumbers = sortService.sortNumbers();

        // Verify the result
        assertArrayEquals(new int[]{1, 3, 5, 8}, sortedNumbers);

        // Verify interaction with the mock
        verify(mockDataRepository).fetchData();
        System.out.println("Mocking Done...");
    }
}