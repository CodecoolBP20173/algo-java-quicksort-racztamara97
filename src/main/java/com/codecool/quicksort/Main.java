package com.codecool.quicksort;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Use the tests to check your code!
        QuickSort sorter = new QuickSort();
        List<Integer> testArray = Arrays.asList(100, 20, 45, 25, 56, 50, 79, 28, 76, 88, 53, 12, 50);
        sorter.sort(testArray);
        for (int i:testArray) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

}
