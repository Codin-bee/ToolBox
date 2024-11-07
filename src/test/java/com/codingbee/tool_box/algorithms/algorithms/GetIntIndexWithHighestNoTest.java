package com.codingbee.tool_box.algorithms.algorithms;

import com.codingbee.tool_box.algorithms.Algorithms;
import com.codingbee.tool_box.exceptions.IncorrectDataException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GetIntIndexWithHighestNoTest {
    //Functional tests
    @Test
    public void highestIndexTest1(){
        int expected = 3;
        int[] arr = new int[]{2, 2, 1, 9, 3};
        int received = Algorithms.getIndexWithHighestVal(arr);
        Assertions.assertEquals(expected, received);
    }

    @Test
    public void highestIndexTest2(){
        int expected = 0;
        int[] arr = new int[]{23, 2, 1, 9, 3};
        int received = Algorithms.getIndexWithHighestVal(arr);
        Assertions.assertEquals(expected, received);
    }

    @Test
    public void highestIndexTest3(){
        int expected = 4;
        int[] arr = new int[]{852, 342, 631, 549, 873};
        int received = Algorithms.getIndexWithHighestVal(arr);
        Assertions.assertEquals(expected, received);
    }

    @Test
    public void highestIndexTest4(){
        int expected = 3;
        int[] arr = new int[]{22, 23, 18, 59, 37};
        int received = Algorithms.getIndexWithHighestVal(arr);
        Assertions.assertEquals(expected, received);
    }

    @Test
    public void highestIndexTest5(){
        int expected = 1;
        int[] arr = new int[]{32, 42, 41, 39, 40};
        int received = Algorithms.getIndexWithHighestVal(arr);
        Assertions.assertEquals(expected, received);
    }


    //Edge case: highest value at more indices
    @Test
    public void highestIndexTest6(){
        int expected = 2;
        int[] arr = new int[]{2, 2, 19, 19, 3};
        int received = Algorithms.getIndexWithHighestVal(arr);
        Assertions.assertEquals(expected, received);
    }

    @Test
    public void highestIndexTest7(){
        int expected = 4;
        int[] arr = new int[]{2, 2, 1, 9, 33, 33, 0, 1, 33};
        int received = Algorithms.getIndexWithHighestVal(arr);
        Assertions.assertEquals(expected, received);
    }


    //Edge case: null passed
    @Test
    public void highestIndexTest8(){
        Assertions.assertThrows(IncorrectDataException.class, ()-> Algorithms.getIndexWithHighestVal((int[]) null));
        int[] arr = new int[]{2, 2, 1, 9, 33, 33, 0, 1, 33};
    }
}