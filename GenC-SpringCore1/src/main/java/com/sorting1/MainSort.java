package com.sorting1;

public class MainSort {

    public static void main(String[] args) {

        int userInput = 0;
        ISort sortAlgorithm;

        int arr [] = {10};

        if(userInput > 10){
            sortAlgorithm = new BubbleSort();
        }else if (userInput > 5){
            sortAlgorithm = new QuickSort();
        }else {
            sortAlgorithm = new CustomSort();
        }

        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm(sortAlgorithm);
        sortingAlgorithm.performSort(arr);
    }
}
