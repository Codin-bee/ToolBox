package com.codingbee.tool_box.sorting.sorting.selection_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SelectionSortByteTest {
    // Functional tests
    @Test
    public void selectionSortTest1() {
        byte[] unsorted = {3, 2, 7, 3, 1, 9};
        byte[] received = Sorting.selectionSort(unsorted);

        byte[] expected = {1, 2, 3, 3, 7, 9};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest2() {
        byte[] unsorted = {43, 64, 58, 0, -89};
        byte[] received = Sorting.selectionSort(unsorted);

        byte[] expected = {-89, 0, 43, 58, 64};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest3() {
        byte[] unsorted = {83, 63, -28, -92, 0, 26, 2};
        byte[] received = Sorting.selectionSort(unsorted);

        byte[] expected = {-92, -28, 0, 2, 26, 63, 83};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest4() {
        byte[] unsorted = {43, -75, 87, 36};
        byte[] received = Sorting.selectionSort(unsorted);

        byte[] expected = {-75, 36, 43, 87};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest5() {
        byte[] unsorted = {86, 73, 84, 47};
        byte[] received = Sorting.selectionSort(unsorted);

        byte[] expected = {47, 73, 84, 86};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest6() {
        byte[] unsorted = {84, 64, 23, 75, 9, -35, -38, -38};
        byte[] received = Sorting.selectionSort(unsorted);

        byte[] expected = {-38, -38, -35, 9, 23, 64, 75, 84};

        Assertions.assertArrayEquals(expected, received);
    }


    // Edge case: null pointer passed
    @Test
    public void selectionSortTest7() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSort((byte[]) null));
    }

    @Test
    public void selectionSortTest8() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSort((byte[]) null));
    }

    @Test
    public void selectionSortTest9() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSort((byte[]) null));
    }
}
