package com.codingbee.tool_box.sorting.sorting.selection_sort;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.sorting.Sorting;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SelectionSortIntTest {
    //Functional tests
    @Test
    public void selectionSortTest1() {
        int[] unsorted = {3, 2, 7, 3, 1, 9};
        int[] received = Sorting.selectionSort(unsorted);

        int[] expected = {1, 2, 3, 3, 7, 9};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest2() {
        int[] unsorted = {43, 64, 5928, 0, -894};
        int[] received = Sorting.selectionSort(unsorted);

        int[] expected = {-894, 0, 43, 64, 5928};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest3() {
        int[] unsorted = {1000, -1000, 0, 500, -500, 123, -123};
        int[] received = Sorting.selectionSort(unsorted);

        int[] expected = {-1000, -500, -123, 0, 123, 500, 1000};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest4() {
        int[] unsorted = {39, -7583, 4873, 365};
        int[] received = Sorting.selectionSort(unsorted);

        int[] expected = {-7583, 39, 365, 4873};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest5() {
        int[] unsorted = {86, 73, 847, 473};
        int[] received = Sorting.selectionSort(unsorted);

        int[] expected = {73, 86, 473, 847};

        Assertions.assertArrayEquals(expected, received);
    }

    @Test
    public void selectionSortTest6() {
        int[] unsorted = {84, 64, 23, 75, 9, -35, -38, -38};
        int[] received = Sorting.selectionSort(unsorted);

        int[] expected = {-38, -38, -35, 9, 23, 64, 75, 84};

        Assertions.assertArrayEquals(expected, received);
    }


    //Edge case: empty array passed
    @Test
    public void selectionSortTest7() {
        int[] unsorted = {};
        int[] received = Sorting.selectionSort(unsorted);

        int[] expected = {};

        Assertions.assertArrayEquals(expected, received);
    }


    //Edge case: null pointer passed
    @Test
    public void selectionSortTest8(){
        Assertions.assertThrows(IncorrectDataException.class, () -> Sorting.selectionSort((int[])  null));
    }
}
