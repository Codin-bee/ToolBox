package com.codingbee.tool_box.sorting.sorting.selection_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SelectionSortShortTest {
    // Functional tests
    @Test
    public void selectionSortTest1() {
        short[] unsorted = {5, 3, 1, 7, 6};
        short[] received = Sorting.selectionSort(unsorted);

        short[] expected = {1, 3, 5, 6, 7};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest2() {
        short[] unsorted = {43, 64, 1023, 0, -400};
        short[] received = Sorting.selectionSort(unsorted);

        short[] expected = {-400, 0, 43, 64, 1023};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest3() {
        short[] unsorted = {320, -320, 0, 150, -150};
        short[] received = Sorting.selectionSort(unsorted);

        short[] expected = {-320, -150, 0, 150, 320};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest4() {
        short[] unsorted = {20, -450, 350, 120};
        short[] received = Sorting.selectionSort(unsorted);

        short[] expected = {-450, 20, 120, 350};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest5() {
        short[] unsorted = {56, 33, 212, 89};
        short[] received = Sorting.selectionSort(unsorted);

        short[] expected = {33, 56, 89, 212};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest6() {
        short[] unsorted = {80, -30, -30, 10, 5, 65};
        short[] received = Sorting.selectionSort(unsorted);

        short[] expected = {-30, -30, 5, 10, 65, 80};

        Assertions.assertArrayEquals(expected, received);
    }


    // Edge case: null pointer passed
    @Test
    public void selectionSortTest7() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSort((short[]) null));
    }

    @Test
    public void selectionSortTest8() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSort((short[]) null));
    }

    @Test
    public void selectionSortTest9() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSort((short[]) null));
    }
}
