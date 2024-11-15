package com.codingbee.tool_box.sorting.sorting.selection_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SelectionSortFloatTest {
    // Functional tests
    @Test
    public void selectionSortTest1() {
        float[] unsorted = {3f, 2f, 7f, 3f, 1f, 9f};
        float[] received = Sorting.selectionSort(unsorted);

        float[] expected = {1f, 2f, 3f, 3f, 7f, 9f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest2() {
        float[] unsorted = {43.8f, 64.328f, 5928.537f, 0f, -894.9f};
        float[] received = Sorting.selectionSort(unsorted);

        float[] expected = {-894.9f, 0f, 43.8f, 64.328f, 5928.537f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest3() {
        float[] unsorted = {836f, 637f, -286f, -927f, 0f, 26f, 2f};
        float[] received = Sorting.selectionSort(unsorted);

        float[] expected = {-927f, -286f, 0f, 2f, 26f, 637f, 836f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest4() {
        float[] unsorted = {43.98f, -7583.328f, 4873.92f, 364.93f};
        float[] received = Sorting.selectionSort(unsorted);

        float[] expected = {-7583.328f, 43.98f, 364.93f, 4873.92f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest5() {
        float[] unsorted = {86.32f, 73.92f, 847.82f, 473.894f};
        float[] received = Sorting.selectionSort(unsorted);

        float[] expected = {73.92f, 86.32f, 473.894f, 847.82f};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest6() {
        float[] unsorted = {84f, 64f, 23f, 75f, 9f, -35f, -38f, -38f};
        float[] received = Sorting.selectionSort(unsorted);

        float[] expected = {-38f, -38f, -35f, 9f, 23f, 64f, 75f, 84f};

        Assertions.assertArrayEquals(expected, received);
    }


    // Edge case: null pointer passed
    @Test
    public void selectionSortTest7() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSort((float[]) null));
    }

    @Test
    public void selectionSortTest8() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSort((float[]) null));
    }

    @Test
    public void selectionSortTest9() {
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSort((float[]) null));
    }
}
