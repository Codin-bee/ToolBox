package com.codingbee.tool_box.sorting;

import com.codingbee.tool_box.exceptions.IncorrectDataException;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Sorting {
    //region Double
    /**
     * Sorts given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return sorted array
     */
    public static double[] selectionSort(double[] original) {
        if (original == null){
            throw new IncorrectDataException("The array to sort can not be a null pointer");
        }
        double[] sorted = Arrays.copyOf(original, original.length);

        for (int i = 0; i < sorted.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[j] < sorted[minIndex]) {
                    minIndex = j;
                }
            }

            double temp = sorted[i];
            sorted[i] = sorted[minIndex];
            sorted[minIndex] = temp;

        }
        return sorted;
    }

    /**
     * Sorts given array in-place selection sort.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
     * @param array the array to sort
     */
    public static void selectionSortInPlace(double[] array){
        if (array == null){
            throw new IncorrectDataException("The array to sort can not be a null pointer");
        }
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            double temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    //endregion
}
