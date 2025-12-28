package com.springsorting4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quickSort")
public class QuickSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {

        return numbers;
    }

}
