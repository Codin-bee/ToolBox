package com.codingbee.tool_box.math.vectors;

import com.codingbee.tool_box.algorithms.Algorithms;
import com.codingbee.tool_box.exceptions.IncorrectDataException;

@SuppressWarnings("unused")
public class Vectors {
    //region Double
    /**
     * Adds elements of two vector at each index and returns new vector containing th sums.
     * @param vectorA first vector
     * @param vectorB second vector
     * @return new vector containing the values added from thee two vectors
     */
    public static double[] add(double[] vectorA, double[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of arras have to be the same in order to add them");
        }
        double[] vectorC = new double[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        return vectorC;
    }

    /**
     * Multiplies all the vector elements at each index and returns the products.
     * @param vectorA first vector
     * @param vectorB second vector
     * @return new vector containing products of the two vectors
     */
    public static double[] multiply(double[] vectorA, double[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of the array have to be the same in order to multiply them");
        }
        double[] vectorC = new double[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] * vectorB[i];
        }
        return vectorC;
    }

    /**
     * Subtracts elements of vectors on each index and return the differences.
     * @param vectorA first vector
     * @param vectorB second vector
     * @return new vector containing the differences of the two vectors
     */
    public static double[] subtract(double[] vectorA, double[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "subtract them from each other");
        }
        double[] vectorC = new double[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] - vectorB[i];
        }
        return vectorC;
    }

    /**
     * Divides the elements of the first vector by the elements of the second one at each index and returns the quotients.
     * @param vectorA first vector that will be divided
     * @param vectorB second vector the first will be divided by
     * @return new vector containing the quotients of the two vectors
     */
    public static double[] divide(double[] vectorA, double[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "divide the first one by the second one");
        }
        double[] vectorC = new double[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] / vectorB[i];
        }
        return vectorC;
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
        return Vectors.sumElements(array) / array.length;
    }
    //endregion Double

    //region Int
    /**
     * This method works exactly as: {@link #add(double[], double[])}
     */
    public static int[] add(int[] vectorA, int[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of arras have to be the same in order to add them");
        }
        int[] vectorC = new int[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #multiply(double[], double[])}
     */
    public static int[] multiply(int[] vectorA, int[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of the array have to be the same in order to multiply them");
        }
        int[] vectorC = new int[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] * vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #subtract(double[], double[])}
     */
    public static int[] subtract(int[] vectorA, int[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "subtract them from each other");
        }
        int[] vectorC = new int[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] - vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #divide(double[], double[])}
     */
    public static int[] divide(int[] vectorA, int[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "divide the first one by the second one");
        }
        int[] vectorC = new int[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] / vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #sumElements(double[])}
     */
    public static int sumElements(int[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    /**
     * This method works exactly as: {@link #findMax(double[])}
     */
    public static int findMax(int[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    /**
     * This method works exactly as: {@link #findMin(double[])}
     */
    public static int findMin(int[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    /**
     * This method works exactly as: {@link #calculateAverage(double[])}
     */
    public static int calculateAverage(int[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        return Vectors.sumElements(array) / array.length;
    }
    //endregion Int
}
