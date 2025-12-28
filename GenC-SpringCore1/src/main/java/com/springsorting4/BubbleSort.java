package com.springsorting4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubbleSort")
public class BubbleSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        System.out.println("BubbleSort");

        return numbers;
    }
}
