package com.codingbee.tool_box.math.vectors;

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

    //region Float
    /**
     * This method works exactly as: {@link #add(double[], double[])}
     */
    public static float[] add(float[] vectorA, float[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of arras have to be the same in order to add them");
        }
        float[] vectorC = new float[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #multiply(double[], double[])}
     */
    public static float[] multiply(float[] vectorA, float[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of the array have to be the same in order to multiply them");
        }
        float[] vectorC = new float[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] * vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #subtract(double[], double[])}
     */
    public static float[] subtract(float[] vectorA, float[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "subtract them from each other");
        }
        float[] vectorC = new float[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] - vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #divide(double[], double[])}
     */
    public static float[] divide(float[] vectorA, float[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "divide the first one by the second one");
        }
        float[] vectorC = new float[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] / vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #sumElements(double[])}
     */
    public static float sumElements(float[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        float sum = 0;
        for (float element : array) {
            sum += element;
        }
        return sum;
    }

    /**
     * This method works exactly as: {@link #findMax(double[])}
     */
    public static float findMax(float[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        float max = array[0];
        for (float element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    /**
     * This method works exactly as: {@link #findMin(double[])}
     */
    public static float findMin(float[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        float min = array[0];
        for (float element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    /**
     * This method works exactly as: {@link #calculateAverage(double[])}
     */
    public static float calculateAverage(float[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        return Vectors.sumElements(array) / array.length;
    }
    //endregion Float

    //region Long
    /**
     * This method works exactly as: {@link #add(double[], double[])}
     */
    public static long[] add(long[] vectorA, long[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of arras have to be the same in order to add them");
        }
        long[] vectorC = new long[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #multiply(double[], double[])}
     */
    public static long[] multiply(long[] vectorA, long[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of the array have to be the same in order to multiply them");
        }
        long[] vectorC = new long[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] * vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #subtract(double[], double[])}
     */
    public static long[] subtract(long[] vectorA, long[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "subtract them from each other");
        }
        long[] vectorC = new long[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] - vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #divide(double[], double[])}
     */
    public static long[] divide(long[] vectorA, long[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "divide the first one by the second one");
        }
        long[] vectorC = new long[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] / vectorB[i];
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #sumElements(double[])}
     */
    public static long sumElements(long[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        long sum = 0;
        for (long element : array) {
            sum += element;
        }
        return sum;
    }

    /**
     * This method works exactly as: {@link #findMax(double[])}
     */
    public static long findMax(long[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        long max = array[0];
        for (long element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    /**
     * This method works exactly as: {@link #findMin(double[])}
     */
    public static long findMin(long[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        long min = array[0];
        for (long element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    /**
     * This method works exactly as: {@link #calculateAverage(double[])}
     */
    public static long calculateAverage(long[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        return Vectors.sumElements(array) / array.length;
    }
    //endregion Long

    //region Short
    /**
     * This method works exactly as: {@link #add(double[], double[])}
     */
    public static short[] add(short[] vectorA, short[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of arras have to be the same in order to add them");
        }
        short[] vectorC = new short[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = (short) (vectorA[i] + vectorB[i]);
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #multiply(double[], double[])}
     */
    public static short[] multiply(short[] vectorA, short[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of the array have to be the same in order to multiply them");
        }
        short[] vectorC = new short[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = (short) (vectorA[i] * vectorB[i]);
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #subtract(double[], double[])}
     */
    public static short[] subtract(short[] vectorA, short[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "subtract them from each other");
        }
        short[] vectorC = new short[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = (short) (vectorA[i] - vectorB[i]);
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #divide(double[], double[])}
     */
    public static short[] divide(short[] vectorA, short[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "divide the first one by the second one");
        }
        short[] vectorC = new short[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = (short) (vectorA[i] / vectorB[i]);
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #sumElements(double[])}
     */
    public static short sumElements(short[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        short sum = 0;
        for (short element : array) {
            sum += element;
        }
        return sum;
    }

    /**
     * This method works exactly as: {@link #findMax(double[])}
     */
    public static short findMax(short[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        short max = array[0];
        for (short element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    /**
     * This method works exactly as: {@link #findMin(double[])}
     */
    public static short findMin(short[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        short min = array[0];
        for (short element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    /**
     * This method works exactly as: {@link #calculateAverage(double[])}
     */
    public static short calculateAverage(short[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        return (short) (Vectors.sumElements(array) / array.length);
    }
    //endregion Long

    //region Byte
    /**
     * This method works exactly as: {@link #add(double[], double[])}
     */
    public static byte[] add(byte[] vectorA, byte[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of arras have to be the same in order to add them");
        }
        byte[] vectorC = new byte[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = (byte) (vectorA[i] + vectorB[i]);
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #multiply(double[], double[])}
     */
    public static byte[] multiply(byte[] vectorA, byte[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The lengths of the array have to be the same in order to multiply them");
        }
        byte[] vectorC = new byte[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = (byte) (vectorA[i] * vectorB[i]);
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #subtract(double[], double[])}
     */
    public static byte[] subtract(byte[] vectorA, byte[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "subtract them from each other");
        }
        byte[] vectorC = new byte[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = (byte) (vectorA[i] - vectorB[i]);
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #divide(double[], double[])}
     */
    public static byte[] divide(byte[] vectorA, byte[] vectorB){
        if (vectorA == null || vectorB == null){
            throw new IncorrectDataException("The arrays can not be a null pointers");
        }
        if (vectorA.length != vectorB.length){
            throw new IncorrectDataException("The arrays need to have the same length in order to " +
                    "divide the first one by the second one");
        }
        byte[] vectorC = new byte[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = (byte) (vectorA[i] / vectorB[i]);
        }
        return vectorC;
    }

    /**
     * This method works exactly as: {@link #sumElements(double[])}
     */
    public static byte sumElements(byte[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        byte sum = 0;
        for (byte element : array) {
            sum += element;
        }
        return sum;
    }

    /**
     * This method works exactly as: {@link #findMax(double[])}
     */
    public static byte findMax(byte[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        byte max = array[0];
        for (byte element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    /**
     * This method works exactly as: {@link #findMin(double[])}
     */
    public static byte findMin(byte[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        byte min = array[0];
        for (byte element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    /**
     * This method works exactly as: {@link #calculateAverage(double[])}
     */
    public static byte calculateAverage(byte[] array){
        if (array == null){
            throw new IncorrectDataException("The array can not be null pointer");
        }
        return (byte) (Vectors.sumElements(array) / array.length);
    }
    //endregion Byte
}
