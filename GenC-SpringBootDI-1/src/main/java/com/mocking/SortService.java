package com.mocking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Arrays;

@Service
public class SortService {

    private final DataRepository dataRepository;

    @Autowired
    public SortService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public int[] sortNumbers() {
        int[] numbers = dataRepository.fetchData();
        Arrays.sort(numbers);
        return numbers;
    }
}