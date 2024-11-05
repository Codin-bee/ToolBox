package com.codingbee.tool_box.math.matrices;

import com.codingbee.tool_box.exceptions.IncorrectDataException;

@SuppressWarnings("unused")
public class Matrices {
    //region Double
    /**
     * Multiplies two given matrices and returns their product
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the product of the two matrices
     */
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

    /**
     * Adds two given matrices and returns their sum
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the sum of the two matrices
     */
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

    /**
     * Subtracts two given matrices and returns their difference
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the difference of the two matrices
     */
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
    //endregion Double

    //region Int
    /**
     * Multiplies two given matrices and returns their product
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the product of the two matrices
     */
    public static int[][] multiply(int[][] matrixA, int[][] matrixB){
        if (matrixA == null || matrixB == null){
            throw new IncorrectDataException("The passed matrices can not be null");
        }
        if (matrixA[0].length != matrixB.length){
            throw new IncorrectDataException("The number of columns in first matrix must be equal to " +
                    "the number of rows in second matrix in order to multiply them");
        }
        int[][] matrixC = new int[matrixA.length][matrixB[0].length];
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

    /**
     * Adds two given matrices and returns their sum
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the sum of the two matrices
     */
    public static int[][] add(int[][] matrixA, int[][] matrixB){
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

        int[][] matrixC = new int[matrixA.length][matrixA[0].length];
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

    /**
     * Subtracts two given matrices and returns their difference
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the difference of the two matrices
     */
    public static int[][] subtract(int[][] matrixA, int[][] matrixB){
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

        int[][] matrixC = new int[matrixA.length][matrixA[0].length];
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
    //endregion Int

    //region Float
    /**
     * Multiplies two given matrices and returns their product
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the product of the two matrices
     */
    public static float[][] multiply(float[][] matrixA, float[][] matrixB){
        if (matrixA == null || matrixB == null){
            throw new IncorrectDataException("The passed matrices can not be null");
        }
        if (matrixA[0].length != matrixB.length){
            throw new IncorrectDataException("The number of columns in first matrix must be equal to " +
                    "the number of rows in second matrix in order to multiply them");
        }
        float[][] matrixC = new float[matrixA.length][matrixB[0].length];
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

    /**
     * Adds two given matrices and returns their sum
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the sum of the two matrices
     */
    public static float[][] add(float[][] matrixA, float[][] matrixB){
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

        float[][] matrixC = new float[matrixA.length][matrixA[0].length];
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

    /**
     * Subtracts two given matrices and returns their difference
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the difference of the two matrices
     */
    public static float[][] subtract(float[][] matrixA, float[][] matrixB){
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

        float[][] matrixC = new float[matrixA.length][matrixA[0].length];
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
    //endregion Float

    //region Long
    /**
     * Multiplies two given matrices and returns their product
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the product of the two matrices
     */
    public static long[][] multiply(long[][] matrixA, long[][] matrixB){
        if (matrixA == null || matrixB == null){
            throw new IncorrectDataException("The passed matrices can not be null");
        }
        if (matrixA[0].length != matrixB.length){
            throw new IncorrectDataException("The number of columns in first matrix must be equal to " +
                    "the number of rows in second matrix in order to multiply them");
        }
        long[][] matrixC = new long[matrixA.length][matrixB[0].length];
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

    /**
     * Adds two given matrices and returns their sum
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the sum of the two matrices
     */
    public static long[][] add(long[][] matrixA, long[][] matrixB){
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

        long[][] matrixC = new long[matrixA.length][matrixA[0].length];
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

    /**
     * Subtracts two given matrices and returns their difference
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the difference of the two matrices
     */
    public static long[][] subtract(long[][] matrixA, long[][] matrixB){
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

        long[][] matrixC = new long[matrixA.length][matrixA[0].length];
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
    //endregion Long

    //region Short
    /**
     * Multiplies two given matrices and returns their product
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the product of the two matrices
     */
    public static short[][] multiply(short[][] matrixA, short[][] matrixB){
        if (matrixA == null || matrixB == null){
            throw new IncorrectDataException("The passed matrices can not be null");
        }
        if (matrixA[0].length != matrixB.length){
            throw new IncorrectDataException("The number of columns in first matrix must be equal to " +
                    "the number of rows in second matrix in order to multiply them");
        }
        short[][] matrixC = new short[matrixA.length][matrixB[0].length];
        try {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixB[0].length; j++) {
                    for (int k = 0; k < matrixB.length; k++) {
                        matrixC[i][j] += (short) (matrixA[i][k] * matrixB[k][j]);
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IncorrectDataException("The passed matrices need to have" +
                    " same number of columns and rows on each index: " + e.getLocalizedMessage());
        }
        return matrixC;
    }

    /**
     * Adds two given matrices and returns their sum
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the sum of the two matrices
     */
    public static short[][] add(short[][] matrixA, short[][] matrixB){
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

        short[][] matrixC = new short[matrixA.length][matrixA[0].length];
        try {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[0].length; j++) {
                    matrixC[i][j] = (short) (matrixA[i][j] + matrixB[i][j]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IncorrectDataException("The passed matrices need to have" +
                    " same number of columns and rows on each index: " + e.getLocalizedMessage());
        }
        return  matrixC;
    }

    /**
     * Subtracts two given matrices and returns their difference
     * @param matrixA first matrix
     * @param matrixB second matrix
     * @return the difference of the two matrices
     */
    public static short[][] subtract(short[][] matrixA, short[][] matrixB){
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

        short[][] matrixC = new short[matrixA.length][matrixA[0].length];
        try {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[0].length; j++) {
                    matrixC[i][j] = (short) (matrixA[i][j] - matrixB[i][j]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IncorrectDataException("The passed matrices need to have" +
                    " same number of columns and rows on each index: " + e.getLocalizedMessage());
        }
        return  matrixC;
    }
    //endregion Short

}