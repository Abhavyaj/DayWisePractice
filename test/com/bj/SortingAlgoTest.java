package com.bj;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SortingAlgoTest {

    @Test
    public void testNormalArray() {
        int[] arr = {5, 3, 8, 4, 2};
        SortingAlgo.bubbleSort(arr);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, arr);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        SortingAlgo.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {7};
        SortingAlgo.bubbleSort(arr);
        assertArrayEquals(new int[]{7}, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        SortingAlgo.bubbleSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

}