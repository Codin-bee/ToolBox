package com.codingbee.tool_box.sorting.sorting.buble_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortLongTest {
    //Functional tests
    @Test
    public void bubbleSortTest1() {
        long[] unsorted = {32L, 21L, 77L, 33L, 10L, 98L};
        long[] received = Sorting.bubbleSort(unsorted);

        long[] expected = {10L, 21L, 32L, 33L, 77L, 98L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest2() {
        long[] unsorted = {438L, 6432L, 5928L, 0L, -894L};
        long[] received = Sorting.bubbleSort(unsorted);

        long[] expected = {-894L, 0L, 438L, 5928L, 6432L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest3() {
        long[] unsorted = {836L, 637L, -286L, -927L, 0L, 26L, 29L};
        long[] received = Sorting.bubbleSort(unsorted);

        long[] expected = {-927L, -286L, 0L, 26L, 29L, 637L, 836L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest4() {
        long[] unsorted = {43L, -7583L, 4873L, 364L};
        long[] received = Sorting.bubbleSort(unsorted);

        long[] expected = {-7583L, 43L, 364L, 4873L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest5() {
        long[] unsorted = {86L, 73L, 847L, 473L, -48L};
        long[] received = Sorting.bubbleSort(unsorted);

        long[] expected = {-48L, 73L, 86L, 473L, 847L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void bubbleSortTest6() {
        long[] unsorted = {84L, 64L, 23L, 75L, 9L, -35L, -38L, -38L, 0L};
        long[] received = Sorting.bubbleSort(unsorted);

        long[] expected = {-38L, -38L, -35L, 0L, 9L, 23L, 64L, 75L, 84L};

        Assertions.assertArrayEquals(expected, received);
    }


    // Edge case: empty array passed
    @Test
    public void bubbleSortTest7() {
        long[] unsorted = {};
        long[] received = Sorting.bubbleSort(unsorted);

        long[] expected = {};
        Assertions.assertArrayEquals(expected, received);
    }


    // Edge case: null array passed
    @Test
    public void bubbleSortTest8() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.bubbleSort((long[]) null));
    }
}
