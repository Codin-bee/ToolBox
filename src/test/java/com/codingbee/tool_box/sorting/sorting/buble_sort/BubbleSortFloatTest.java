package com.codingbee.tool_box.sorting.sorting.buble_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortFloatTest {
    //Functional tests
    @Test
    public void bubbleSortTest1() {
        float[] unsorted = {3.2f, 2.1f, 7.7f, 3.3f, 1.0f, 9.8f};
        float[] received = Sorting.bubbleSort(unsorted);

        float[] expected = {1.0f, 2.1f, 3.2f, 3.3f, 7.7f, 9.8f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest2() {
        float[] unsorted = {43.8f, 64.32f, 5928.53f, 0f, -894.9f};
        float[] received = Sorting.bubbleSort(unsorted);

        float[] expected = {-894.9f, 0f, 43.8f, 64.32f, 5928.53f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest3() {
        float[] unsorted = {836.5f, 637.1f, -286.0f, -927.2f, 0f, 26.3f, 2.9f};
        float[] received = Sorting.bubbleSort(unsorted);

        float[] expected = {-927.2f, -286.0f, 0f, 2.9f, 26.3f, 637.1f, 836.5f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest4() {
        float[] unsorted = {43.98f, -7583.33f, 4873.92f, 364.93f};
        float[] received = Sorting.bubbleSort(unsorted);

        float[] expected = {-7583.33f, 43.98f, 364.93f, 4873.92f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest5() {
        float[] unsorted = {86.32f, 73.92f, 847.82f, 473.894f, -48.12f};
        float[] received = Sorting.bubbleSort(unsorted);

        float[] expected = {-48.12f, 73.92f, 86.32f, 473.894f, 847.82f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest6() {
        float[] unsorted = {84f, 64f, 23f, 75f, 9f, -35f, -38f, -38f, 0f};
        float[] received = Sorting.bubbleSort(unsorted);

        float[] expected = {-38f, -38f, -35f, 0f, 9f, 23f, 64f, 75f, 84f};

        Assertions.assertArrayEquals(expected, received);
    }


    //Edge case: empty array passed
    @Test
    public void selectionSortTest7(){
        float[] unsorted = {};
        float[] received = Sorting.bubbleSort(unsorted);

        float[] expected = {};
        Assertions.assertArrayEquals(expected, received);
    }


    //Edge case: null pointer passed
    @Test
    public void selectionSortTest8(){
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.bubbleSort((float[]) null));
    }
}
