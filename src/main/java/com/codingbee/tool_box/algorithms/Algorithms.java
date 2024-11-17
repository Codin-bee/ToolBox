package com.codingbee.tool_box.algorithms;

import com.codingbee.tool_box.exceptions.IncorrectDataException;

@SuppressWarnings("unused")
public class Algorithms {
    //Double
    /**
     * Simple method used to find the element with the highest value.
     * Special case: If the highest value is found at more indexes returns the lowest of the indexes.
     * @param values array where the algorithm searches.
     * @return index of the element with the highest value
     * @throws IncorrectDataException in case the inserted array is null
     */
    public static int getIndexWithHighestVal(double[] values) throws IncorrectDataException {
        if(values == null){
            throw new IncorrectDataException("Get index with highest value - the array must not be null");
        }
        int indexWithHighestNo = 0;
        double highestNo = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i]>highestNo){
                highestNo = values[i];
                indexWithHighestNo = i;
            }
        }
        return indexWithHighestNo;
    }

    /**
     * Applies the softmax function to given array in-place instead of returning new one
     * @param values values to apply the softmax to
     * @param temp temperature variable, part of the formula
     */
    public static void softmaxInPlace(double[] values, double temp){
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = Math.exp(values[i] / temp);
            sum += values[i];
        }
        for (int i = 0; i < values.length; i++) {
            values[i] /= sum;
        }
    }

    /**
     * Sums all elements of the given array.
     * @param array the array to sum
     * @return the sum of all the elements in the given array
     */
    public static double sumElements(double[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    /**
     * Finds the highest value in the array
     * @param array array to search
     * @return the highest value in the given array
     */
    public static double findMax(double[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        double max = array[0];
        for (double element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    /**
     * Finds the lowest value in the given array
     * @param array the array to search
     * @return the lowest value in the given array
     */
    public static double findMin(double[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        double min = array[0];
        for (double element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    /**
     * Calculates the average value of all the array elements
     * @param array the array to calculate average from
     * @return the average value of all the array elements
     */
    public static double calculateAverage(double[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        return Algorithms.sumElements(array) / array.length;
    }

    //Int
    /**
     * Simple method used to find the element with the highest value.
     * Special case: If the highest value is found at more indexes returns the lowest of the indexes.
     * @param values array where the algorithm searches.
     * @return index of the element with the highest value
     * @throws IncorrectDataException in case the inserted array is null
     */
    public static int getIndexWithHighestVal(int[] values) throws IncorrectDataException {
        if(values == null){
            throw new IncorrectDataException("Get index with highest value - the array must not be null");
        }
        int indexWithHighestNo = 0;
        int highestNo = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i]>highestNo){
                highestNo = values[i];
                indexWithHighestNo = i;
            }
        }
        return indexWithHighestNo;
    }

    /**
     * Applies the softmax function to given array in-place instead of returning new one
     * @param values values to apply the softmax to
     * @param temp temperature variable, part of the formula
     */
    public static void softmaxInPlace(int[] values, int temp){
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) Math.exp((double) values[i] / temp);
            sum += values[i];
        }
        for (int i = 0; i < values.length; i++) {
            values[i] /= sum;
        }
    }


    //Float
    /**
     * Simple method used to find the element with the highest value.
     * Special case: If the highest value is found at more indexes returns the lowest of the indexes.
     * @param values array where the algorithm searches.
     * @return index of the element with the highest value
     * @throws IncorrectDataException in case the inserted array is null
     */
    public static int getIndexWithHighestVal(float[] values) throws IncorrectDataException {
        if(values == null){
            throw new IncorrectDataException("Get index with highest value - the array must not be null");
        }
        int indexWithHighestNo = 0;
        float highestNo = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i]>highestNo){
                highestNo = values[i];
                indexWithHighestNo = i;
            }
        }
        return indexWithHighestNo;
    }

    /**
     * Applies the softmax function to given array in-place instead of returning new one
     * @param values values to apply the softmax to
     * @param temp temperature variable, part of the formula
     */
    public static void softmaxInPlace(float[] values, float temp){
        float sum = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = (float) Math.exp(values[i] / temp);
            sum += values[i];
        }
        for (int i = 0; i < values.length; i++) {
            values[i] /= sum;
        }
    }


    //Long
    /**
     * Simple method used to find the element with the highest value.
     * Special case: If the highest value is found at more indexes returns the lowest of the indexes.
     * @param values array where the algorithm searches.
     * @return index of the element with the highest value
     * @throws IncorrectDataException in case the inserted array is null
     */
    public static int getIndexWithHighestVal(long[] values) throws IncorrectDataException {
        if(values == null){
            throw new IncorrectDataException("Get index with highest value - the array must not be null");
        }
        int indexWithHighestNo = 0;
        long highestNo = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i]>highestNo){
                highestNo = values[i];
                indexWithHighestNo = i;
            }
        }
        return indexWithHighestNo;
    }

    /**
     * Applies the softmax function to given array in-place instead of returning new one
     * @param values values to apply the softmax to
     * @param temp temperature variable, part of the formula
     */
    public static void softmaxInPlace(long[] values, long temp){
        long sum = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = (long) Math.exp((double) values[i] / temp);
            sum += values[i];
        }
        for (int i = 0; i < values.length; i++) {
            values[i] /= sum;
        }
    }


    //Short
    /**
     * Simple method used to find the element with the highest value.
     * Special case: If the highest value is found at more indexes returns the lowest of the indexes.
     * @param values array where the algorithm searches.
     * @return index of the element with the highest value
     * @throws IncorrectDataException in case the inserted array is null
     */
    public static int getIndexWithHighestVal(short[] values) throws IncorrectDataException {
        if(values == null){
            throw new IncorrectDataException("Get index with highest value - the array must not be null");
        }
        int indexWithHighestNo = 0;
        short highestNo = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i]>highestNo){
                highestNo = values[i];
                indexWithHighestNo = i;
            }
        }
        return indexWithHighestNo;
    }

    /**
     * Applies the softmax function to given array in-place instead of returning new one
     * @param values values to apply the softmax to
     * @param temp temperature variable, part of the formula
     */
    public static void softmaxInPlace(short[] values, short temp){
        short sum = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = (short) Math.exp((double) values[i] / temp);
            sum += values[i];
        }
        for (int i = 0; i < values.length; i++) {
            values[i] /= sum;
        }
    }
}