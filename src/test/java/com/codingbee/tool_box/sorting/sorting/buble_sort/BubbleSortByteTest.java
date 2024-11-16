package com.codingbee.tool_box.sorting.sorting.buble_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortByteTest {
    //Functional tests
    @Test
    public void bubbleSortTest1() {
        byte[] unsorted = {32, 21, 77, 33, 10, 98};
        byte[] received = Sorting.bubbleSort(unsorted);

        byte[] expected = {10, 21, 32, 33, 77, 98};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest2() {
        byte[] unsorted = {43, 64, 92, 0, -89};
        byte[] received = Sorting.bubbleSort(unsorted);

        byte[] expected = {-89, 0, 43, 64, 92};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest3() {
        byte[] unsorted = {83, 63, -28, -92, 0, 26, 29};
        byte[] received = Sorting.bubbleSort(unsorted);

        byte[] expected = {-92, -28, 0, 26, 29, 63, 83};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest4() {
        byte[] unsorted = {43, -75, 48, 36};
        byte[] received = Sorting.bubbleSort(unsorted);

        byte[] expected = {-75, 36, 43, 48};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest5() {
        byte[] unsorted = {86, 73, 47, 23, -48};
        byte[] received = Sorting.bubbleSort(unsorted);

        byte[] expected = {-48, 23, 47, 73, 86};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest6() {
        byte[] unsorted = {84, 64, 23, 75, 9, -35, -38, -38, 0};
        byte[] received = Sorting.bubbleSort(unsorted);

        byte[] expected = {-38, -38, -35, 0, 9, 23, 64, 75, 84};

        Assertions.assertArrayEquals(expected, received);
    }

    // Edge case: empty array passed
    @Test
    public void bubbleSortTest7() {
        byte[] unsorted = {};
        byte[] received = Sorting.bubbleSort(unsorted);

        byte[] expected = {};
        Assertions.assertArrayEquals(expected, received);
    }

    // Edge case: null array passed
    @Test
    public void bubbleSortTest8() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.bubbleSort((byte[]) null));
    }

}
