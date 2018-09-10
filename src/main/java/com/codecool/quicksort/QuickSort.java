package com.codecool.quicksort;

import java.util.List;
import java.util.Random;

public class QuickSort {

    /**
     * Sorts the given List in place
     * @param toSort the List to sort. Throws an error if its null
     */

    private List<Integer> toSort;
    private int length;


    private void changeNumbers(int numberToChange, int newNumber) {
        int temp = toSort.get(numberToChange);
        toSort.set(numberToChange, toSort.get(newNumber));
        toSort.set(newNumber, temp);
    }

    private void quickSort(int leftIndex, int rightIndex) {

        //Random random = new Random();
        //int  randomPivot = random.nextInt(rightIndex-1) + 1;
        int left = leftIndex;
        int right = rightIndex;
        int pivot = toSort.get(leftIndex + (rightIndex - leftIndex) / 2);
        while (left <= right) {
            while (toSort.get(left) < pivot) {
                left++;
            }
            while (toSort.get(right) > pivot) {
                right--;
            }
            if (left <= right) {
                changeNumbers(left, right);
                left++;
                right--;
            }
        }
        if (leftIndex < right){
        quickSort(leftIndex, right);
        }
        if (left < rightIndex){
            quickSort(left, rightIndex);
        }
    }
        public void sort(List<Integer> toSort) {

            if (toSort == null) {
                throw new IllegalArgumentException();
            }
            else if (toSort.size() == 0) {
                return;
            }

            this.toSort = toSort;
            length = toSort.size();
            quickSort(0, length - 1);
        }


}

