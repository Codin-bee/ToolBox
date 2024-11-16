package com.codingbee.tool_box.sorting.sorting.selection_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SelectionSortInPlaceFloatTest {
    // Functional tests
    @Test
    public void selectionSortTest1() {
        float[] received = {3.5f, 2.2f, 7.1f, 3.0f, 1.0f, 9.8f};
        Sorting.selectionSortInPlace(received);
        float[] expected = {1.0f, 2.2f, 3.0f, 3.5f, 7.1f, 9.8f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest2() {
        float[] received = {43.8f, 64.3f, 58.9f, 0f, -89.4f};
        Sorting.selectionSortInPlace(received);
        float[] expected = {-89.4f, 0f, 43.8f, 58.9f, 64.3f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest3() {
        float[] received = {83.6f, 63.7f, -28.6f, -92.7f, 0f, 26.4f, 2.1f};
        Sorting.selectionSortInPlace(received);
        float[] expected = {-92.7f, -28.6f, 0f, 2.1f, 26.4f, 63.7f, 83.6f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest4() {
        float[] received = {43.9f, -75.3f, 87.2f, 36.5f};
        Sorting.selectionSortInPlace(received);
        float[] expected = {-75.3f, 36.5f, 43.9f, 87.2f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest5() {
        float[] received = {86.3f, 73.9f, 84.7f, 47.4f};
        Sorting.selectionSortInPlace(received);
        float[] expected = {47.4f, 73.9f, 84.7f, 86.3f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest6() {
        float[] received = {84.2f, 64.8f, 23.5f, 75.1f, 9.9f, -35.3f, -38.8f, -38.8f};
        Sorting.selectionSortInPlace(received);
        float[] expected = {-38.8f, -38.8f, -35.3f, 9.9f, 23.5f, 64.8f, 75.1f, 84.2f};

        Assertions.assertArrayEquals(expected, received);
    }


    //Edge case: empty array passed
    @Test
    public void selectionSortTest7() {
        float[] received = {};
        Sorting.selectionSortInPlace(received);
        float[] expected = {};

        Assertions.assertArrayEquals(expected, received);
    }


    // Edge case: null pointer passed
    @Test
    public void selectionSortTest8() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSortInPlace((float[]) null));
    }
}
