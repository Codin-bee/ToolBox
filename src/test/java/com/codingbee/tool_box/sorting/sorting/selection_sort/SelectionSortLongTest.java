package com.codingbee.tool_box.sorting.sorting.selection_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortLongTest {
    //Functional tests
    @Test
    public void selectionSortTest1() {
        long[] unsorted = {3L, 2L, 7L, 3L, 1L, 9L};
        long[] received = Sorting.selectionSort(unsorted);

        long[] expected = {1L, 2L, 3L, 3L, 7L, 9L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest2() {
        long[] unsorted = {43L, 64L, 5928L, 0L, -894L};
        long[] received = Sorting.selectionSort(unsorted);

        long[] expected = {-894L, 0L, 43L, 64L, 5928L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest3() {
        long[] unsorted = {1000L, -1000L, 0L, 500L, -500L, 123L, -123L};
        long[] received = Sorting.selectionSort(unsorted);

        long[] expected = {-1000L, -500L, -123L, 0L, 123L, 500L, 1000L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest4() {
        long[] unsorted = {39L, -7583L, 4873L, 365L};
        long[] received = Sorting.selectionSort(unsorted);

        long[] expected = {-7583L, 39L, 365L, 4873L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest5() {
        long[] unsorted = {86L, 73L, 847L, 473L};
        long[] received = Sorting.selectionSort(unsorted);

        long[] expected = {73L, 86L, 473L, 847L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest6() {
        long[] unsorted = {84L, 64L, 23L, 75L, 9L, -35L, -38L, -38L};
        long[] received = Sorting.selectionSort(unsorted);

        long[] expected = {-38L, -38L, -35L, 9L, 23L, 64L, 75L, 84L};

        Assertions.assertArrayEquals(expected, received);
    }


    //Edge case: empty array passed
    @Test
    public void selectionSortTest7() {
        long[] unsorted = {};
        long[] received = Sorting.selectionSort(unsorted);

        long[] expected = {};

        Assertions.assertArrayEquals(expected, received);
    }


    //Edge case: null pointer passed
    @Test
    public void selectionSortTest8(){
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSort((long[]) null));
    }
}
