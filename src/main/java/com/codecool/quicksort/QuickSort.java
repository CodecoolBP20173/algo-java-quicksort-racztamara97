package com.codecool.quicksort;

import java.util.List;

public class QuickSort {

    /**
     * Sorts the given List in place
     * @param toSort the List to sort. Throws an error if its null
     */

    private List<Integer> toSort;

    private void sort(List<Integer> toSort) {}

    private void changeNumbers(int numberToChange, int newNumber) {
        int temp = toSort.get(numberToChange);
        toSort.set(numberToChange, toSort.get(newNumber));
        toSort.set(newNumber, temp);
    }

}

