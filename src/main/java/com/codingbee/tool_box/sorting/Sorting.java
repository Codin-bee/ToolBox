package com.codingbee.tool_box.sorting;

import com.codingbee.tool_box.exceptions.IncorrectDataException;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Sorting {
    //region Double
    /**
     * Sorts the given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1),
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return the array with sorted values
     */
    public static double[] selectionSort(double[] original) {
        if (original == null){
            throw new IncorrectDataException("The array to sort can not be a null pointer");
        }
        double[] sorted = Arrays.copyOf(original, original.length);
        Sorting.selectionSortInPlace(sorted);
        return sorted;
    }

    /**
     * Sorts the given array in-place using selection sort.
     * This algorithm has time complexity O(n^2) and space complexity O(1).
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

    /**
     * Sorts the given array in-place using bubble sort.
     * This algorithm has time complexity O(n^2) and space complexity O(1).
     * @param array the array to sort
     */
    public static void bubbleSortInPlace(double[] array) {
        if (array == null){
            throw new IncorrectDataException("The array to sort can not be a null pointer");
        }
        boolean swapped;
        double temp;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }


    /**
     * Sorts the given array using bubble sort and returns the array containing sorted values.
     * This algorithm has time complexity O(n^2) and space complexity O(1),
     * with the additional
     * @param original the array to sort
     * @return the array with sorted values
     */
    public static double[] bubbleSort(double[] original){
        if (original == null){
            throw new IncorrectDataException("The array to sort can not be a null pointer");
        }
        double[] sorted = Arrays.copyOf(original, original.length);
        Sorting.bubbleSortInPlace(sorted);
        return sorted;
    }

    //endregion Double

    //region Int
    /**
     * Sorts the given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1),
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return the array with sorted values
     */
    public static int[] selectionSort(int[] original) {
        if (original == null){
            throw new IncorrectDataException("The array to sort can not be a null pointer");
        }
        int[] sorted = Arrays.copyOf(original, original.length);
        Sorting.selectionSortInPlace(sorted);
        return sorted;
    }

    /**
     * Sorts the given array in-place using selection sort.
     * This algorithm has time complexity O(n^2) and space complexity O(1).
     * @param array the array to sort
     */
    public static void selectionSortInPlace(int[] array){
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

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    //endregion Int

    //region Float
    /**
     * Sorts the given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1),
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return the array with sorted values
     */
    public static float[] selectionSort(float[] original) {
        if (original == null){
            throw new IncorrectDataException("The array to sort can not be a null pointer");
        }
        float[] sorted = Arrays.copyOf(original, original.length);
        Sorting.selectionSortInPlace(sorted);
        return sorted;
    }

    /**
     * Sorts the given array in-place using selection sort.
     * This algorithm has time complexity O(n^2) and space complexity O(1).
     * @param array the array to sort
     */
    public static void selectionSortInPlace(float[] array){
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

            float temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    //endregion Float

    //region Long
    /**
     * Sorts the given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1),
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return the array with sorted values
     */
    public static long[] selectionSort(long[] original) {
        if (original == null){
            throw new IncorrectDataException("The array to sort can not be a null pointer");
        }
        long[] sorted = Arrays.copyOf(original, original.length);
        Sorting.selectionSortInPlace(sorted);
        return sorted;
    }

    /**
     * Sorts given array in-place selection sort.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
     * @param array the array to sort
     */
    public static void selectionSortInPlace(long[] array){
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

            long temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    //endregion Long

    //region Short
    /**
     * Sorts the given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1),
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return the array with sorted values
     */
    public static short[] selectionSort(short[] original) {
        if (original == null){
            throw new IncorrectDataException("The array to sort can not be a null pointer");
        }
        short[] sorted = Arrays.copyOf(original, original.length);
        Sorting.selectionSortInPlace(sorted);
        return sorted;
    }

    /**
     * Sorts given array in-place selection sort.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
     * @param array the array to sort
     */
    public static void selectionSortInPlace(short[] array){
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

            short temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    //endregion Short

    //region Byte
    /**
     * Sorts the given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1),
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return the array with sorted values
     */
    public static byte[] selectionSort(byte[] original) {
        if (original == null){
            throw new IncorrectDataException("The array to sort can not be a null pointer");
        }
        byte[] sorted = Arrays.copyOf(original, original.length);
        Sorting.selectionSortInPlace(sorted);
        return sorted;
    }

    /**
     * Sorts given array in-place selection sort.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
     * @param array the array to sort
     */
    public static void selectionSortInPlace(byte[] array){
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

            byte temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    //endregion Short

}