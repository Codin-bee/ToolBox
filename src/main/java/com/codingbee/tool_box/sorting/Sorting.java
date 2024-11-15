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
        Sorting.selectionSortInPlace(sorted);
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
    //endregion Double

    //region Int
    /**
     * Sorts given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return sorted array
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
     * Sorts given array in-place selection sort.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
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
     * Sorts given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return sorted array
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
     * Sorts given array in-place selection sort.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
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
     * Sorts given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return sorted array
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
     * Sorts given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return sorted array
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
     * Sorts given array using selection sort and returns the sorted version.
     * This algorithm has time complexity O(n^2) and space complexity O(1)
     * with the additional O(n) space required for the output array.
     * @param original the array to sort
     * @return sorted array
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