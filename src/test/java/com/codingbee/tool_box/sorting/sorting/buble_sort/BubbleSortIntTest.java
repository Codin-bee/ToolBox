package com.codingbee.tool_box.sorting.sorting.buble_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortIntTest {
    //Functional tests
    @Test
    public void bubbleSortTest1() {
        int[] unsorted = {32, 21, 77, 33, 10, 98};
        int[] received = Sorting.bubbleSort(unsorted);

        int[] expected = {10, 21, 32, 33, 77, 98};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest2() {
        int[] unsorted = {438, 6432, 5928, 0, -894};
        int[] received = Sorting.bubbleSort(unsorted);

        int[] expected = {-894, 0, 438, 5928, 6432};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest3() {
        int[] unsorted = {836, 637, -286, -927, 0, 26, 29};
        int[] received = Sorting.bubbleSort(unsorted);

        int[] expected = {-927, -286, 0, 26, 29, 637, 836};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest4() {
        int[] unsorted = {43, -7583, 4873, 364};
        int[] received = Sorting.bubbleSort(unsorted);

        int[] expected = {-7583, 43, 364, 4873};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest5() {
        int[] unsorted = {86, 73, 847, 473, -48};
        int[] received = Sorting.bubbleSort(unsorted);

        int[] expected = {-48, 73, 86, 473, 847};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest6() {
        int[] unsorted = {84, 64, 23, 75, 9, -35, -38, -38, 0};
        int[] received = Sorting.bubbleSort(unsorted);

        int[] expected = {-38, -38, -35, 0, 9, 23, 64, 75, 84};

        Assertions.assertArrayEquals(expected, received);
    }


    // Edge case: empty array passed
    @Test
    public void bubbleSortTest7() {
        int[] unsorted = {};
        int[] received = Sorting.bubbleSort(unsorted);

        int[] expected = {};
        Assertions.assertArrayEquals(expected, received);
    }


    // Edge case: null array passed
    @Test
    public void bubbleSortTest8() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.bubbleSort((int[]) null));
    }
}
