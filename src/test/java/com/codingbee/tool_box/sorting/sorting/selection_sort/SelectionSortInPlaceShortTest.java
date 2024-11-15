package com.codingbee.tool_box.sorting.sorting.selection_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SelectionSortInPlaceShortTest {
    // Functional tests
    @Test
    public void selectionSortTest1() {
        short[] received = {3, 2, 7, 3, 1, 9};
        Sorting.selectionSortInPlace(received);
        short[] expected = {1, 2, 3, 3, 7, 9};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest2() {
        short[] received = {43, 64, 5928, 0, -894};
        Sorting.selectionSortInPlace(received);
        short[] expected = {-894, 0, 43, 64, 5928};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest3() {
        short[] received = {836, 637, -286, -927, 0, 26, 2};
        Sorting.selectionSortInPlace(received);
        short[] expected = {-927, -286, 0, 2, 26, 637, 836};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest4() {
        short[] received = {43, -7583, 4873, 364};
        Sorting.selectionSortInPlace(received);
        short[] expected = {-7583, 43, 364, 4873};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest5() {
        short[] received = {86, 73, 847, 473};
        Sorting.selectionSortInPlace(received);
        short[] expected = {73, 86, 473, 847};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest6() {
        short[] received = {84, 64, 23, 75, 9, -35, -38, -38};
        Sorting.selectionSortInPlace(received);
        short[] expected = {-38, -38, -35, 9, 23, 64, 75, 84};

        Assertions.assertArrayEquals(expected, received);
    }

    // Edge case: null pointer passed
    @Test
    public void selectionSortTest7() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSortInPlace((short[]) null));
    }

    @Test
    public void selectionSortTest8() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSortInPlace((short[]) null));
    }

    @Test
    public void selectionSortTest9() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSortInPlace((short[]) null));
    }
}
