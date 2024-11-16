package com.codingbee.tool_box.sorting.sorting.selection_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SelectionSortInPlaceByteTest {
    // Functional tests
    @Test
    public void selectionSortTest1() {
        byte[] received = {3, 2, 7, 3, 1, 9};
        Sorting.selectionSortInPlace(received);
        byte[] expected = {1, 2, 3, 3, 7, 9};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest2() {
        byte[] received = {43, 64, 58, 0, -89};
        Sorting.selectionSortInPlace(received);
        byte[] expected = {-89, 0, 43, 58, 64};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest3() {
        byte[] received = {83, 63, -28, -92, 0, 26, 2};
        Sorting.selectionSortInPlace(received);
        byte[] expected = {-92, -28, 0, 2, 26, 63, 83};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest4() {
        byte[] received = {43, -75, 87, 36};
        Sorting.selectionSortInPlace(received);
        byte[] expected = {-75, 36, 43, 87};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest5() {
        byte[] received = {86, 73, 84, 47};
        Sorting.selectionSortInPlace(received);
        byte[] expected = {47, 73, 84, 86};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest6() {
        byte[] received = {84, 64, 23, 75, 9, -35, -38, -38};
        Sorting.selectionSortInPlace(received);
        byte[] expected = {-38, -38, -35, 9, 23, 64, 75, 84};

        Assertions.assertArrayEquals(expected, received);
    }


    //Edge case: empty array passed
    @Test
    public void selectionSortTest7() {
        byte[] received = {};
        Sorting.selectionSortInPlace(received);
        byte[] expected = {};

        Assertions.assertArrayEquals(expected, received);
    }


    // Edge case: null pointer passed
    @Test
    public void selectionSortTest8() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSortInPlace((byte[]) null));
    }
}
