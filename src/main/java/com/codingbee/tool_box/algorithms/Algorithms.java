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
}