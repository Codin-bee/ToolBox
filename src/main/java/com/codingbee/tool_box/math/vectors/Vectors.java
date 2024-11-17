package com.codingbee.tool_box.math.vectors;

import com.codingbee.tool_box.exceptions.IncorrectDataException;

@SuppressWarnings("unused")
public class Vectors {
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
}
