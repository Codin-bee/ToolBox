package com.codingbee.tool_box.sorting.sorting.buble_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BubbleSortInPlaceDoubleTest {
    //Functional tests
    @Test
    public void selectionSortTest1(){
        double[] received = {3, 2, 7, 3, 1, 9};
        Sorting.bubbleSortInPlace(received);
        double[] expected = {1, 2, 3, 3, 7, 9};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest2(){
        double[] received = {43.8, 64.328, 5928.537, 0, -894.9};
        Sorting.bubbleSortInPlace(received);
        double[] expected = {-894.9, 0, 43.8, 64.328, 5928.537};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest3(){
        double[] received = {836, 637, -286, -927, 0, 26, 2};
        Sorting.bubbleSortInPlace(received);
        double[] expected = {-927, -286, 0, 2, 26, 637, 836};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest4(){
        double[] received = {43.98, -7583.328, 4873.92, 364.93};
        Sorting.bubbleSortInPlace(received);
        double[] expected = {-7583.328, 43.98, 364.93, 4873.92};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest5(){
        double[] received = {86.32, 73.92, 847.82, 473.894};
        Sorting.bubbleSortInPlace(received);
        double[] expected = {73.92, 86.32, 473.894, 847.82};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest6(){
        double[] received ={84, 64, 23, 75, 9, -35, -38, -38};
        Sorting.bubbleSortInPlace(received);
        double[] expected = {-38, -38, -35, 9, 23, 64, 75, 84};

        Assertions.assertArrayEquals(expected, received);
    }


    //Edge case: empty array passed
    @Test
    public void selectionSortTest7(){
        double[] received ={};
        Sorting.bubbleSortInPlace(received);
        double[] expected = {};

        Assertions.assertArrayEquals(expected, received);
    }


    //Edge case: null pointer passed
    @Test
    public void selectionSortTest8(){
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.bubbleSortInPlace((double[])  null));
    }
}
