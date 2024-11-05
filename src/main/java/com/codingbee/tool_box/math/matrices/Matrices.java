package com.codingbee.tool_box.math.matrices;

import com.codingbee.tool_box.exceptions.IncorrectDataException;

@SuppressWarnings("unused")
public class Matrices {
    public static double[][] multiply(double[][] matrixA, double[][] matrixB){
        if (matrixA == null || matrixB == null){
            throw new IncorrectDataException("The passed matrices can not be null");
        }
        if (matrixA[0].length != matrixB.length){
            throw new IncorrectDataException("The number of columns in first matrix must be equal to " +
                    "the number of rows in second matrix in order to multiply them");
        }
        double[][] matrixC = new double[matrixA.length][matrixB[0].length];
        try {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixB[0].length; j++) {
                    for (int k = 0; k < matrixB.length; k++) {
                        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IncorrectDataException("The passed matrices need to have" +
                    " same number of columns and rows on each index: " + e.getLocalizedMessage());
        }
        return matrixC;
    }

    public static double[][] add(double[][] matrixA, double[][] matrixB){
        if (matrixA == null || matrixB == null){
            throw new IncorrectDataException("The passed matrices can not be null");
        }
        if (matrixA.length != matrixB.length){
            throw new IncorrectDataException("The matrices have to have same dimensions in order to add them," +
                    " but the number of rows in each is not the same");
        }
        if (matrixA[0].length != matrixB[0].length){
            throw new IncorrectDataException("The matrices have to have same dimensions in order to add them," +
                    " but the number of columns in each is not the same");
        }

        double[][] matrixC = new double[matrixA.length][matrixA[0].length];
        try {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[0].length; j++) {
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IncorrectDataException("The passed matrices need to have" +
                    " same number of columns and rows on each index: " + e.getLocalizedMessage());
        }
        return  matrixC;
    }

    public static double[][] subtract(double[][] matrixA, double[][] matrixB){
        if (matrixA == null || matrixB == null){
            throw new IncorrectDataException("The passed matrices can not be null");
        }
        if (matrixA.length != matrixB.length){
            throw new IncorrectDataException("The matrices have to have same dimensions in order to subtract them," +
                    " but the number of rows in each is not the same");
        }
        if (matrixA[0].length != matrixB[0].length){
            throw new IncorrectDataException("The matrices have to have same dimensions in order to subtract them," +
                    " but the number of columns in each is not the same");
        }

        double[][] matrixC = new double[matrixA.length][matrixA[0].length];
        try {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[0].length; j++) {
                    matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IncorrectDataException("The passed matrices need to have" +
                    " same number of columns and rows on each index: " + e.getLocalizedMessage());
        }
        return  matrixC;
    }
}
