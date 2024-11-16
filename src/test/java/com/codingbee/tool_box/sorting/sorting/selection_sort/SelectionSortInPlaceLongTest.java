package com.codingbee.tool_box.sorting.sorting.selection_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SelectionSortInPlaceLongTest {
    // Functional tests
    @Test
    public void selectionSortTest1() {
        long[] received = {3000000000L, 2000000000L, 7000000000L, 3000000000L, 1000000000L, 9000000000L};
        Sorting.selectionSortInPlace(received);
        long[] expected = {1000000000L, 2000000000L, 3000000000L, 3000000000L, 7000000000L, 9000000000L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest2() {
        long[] received = {43800000000L, 64328000000L, 59285370000L, 0L, -89490000000L};
        Sorting.selectionSortInPlace(received);
        long[] expected = {-89490000000L, 0L, 43800000000L, 59285370000L, 64328000000L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest3() {
        long[] received = {836000000L, 637000000L, -286000000L, -927000000L, 0L, 26000000L, 2000000L};
        Sorting.selectionSortInPlace(received);
        long[] expected = {-927000000L, -286000000L, 0L, 2000000L, 26000000L, 637000000L, 836000000L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest4() {
        long[] received = {43980000000L, -758332800000L, 48739200000L, 36493000000L};
        Sorting.selectionSortInPlace(received);
        long[] expected = {-758332800000L, 36493000000L, 43980000000L, 48739200000L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest5() {
        long[] received = {863200000L, 739200000L, 847820000L, 473894000L};
        Sorting.selectionSortInPlace(received);
        long[] expected = {473894000L, 739200000L, 847820000L, 863200000L};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest6() {
        long[] received = {84000000L, 64000000L, 23000000L, 75000000L, 9000000L, -35000000L, -38000000L, -38000000L};
        Sorting.selectionSortInPlace(received);
        long[] expected = {-38000000L, -38000000L, -35000000L, 9000000L, 23000000L, 64000000L, 75000000L, 84000000L};

        Assertions.assertArrayEquals(expected, received);
    }


    //Edge case: empty array passed
    @Test
    public void selectionSortTest7() {
        long[] received = {};
        Sorting.selectionSortInPlace(received);
        long[] expected = {};

        Assertions.assertArrayEquals(expected, received);
    }


    // Edge case: null pointer passed
    @Test
    public void selectionSortTest8() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSortInPlace((long[]) null));
    }
}
