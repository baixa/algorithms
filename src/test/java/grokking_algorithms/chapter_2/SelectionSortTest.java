package grokking_algorithms.chapter_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Юнит-тесты для метода сортировки массивов посредством алгоритма "Сортировка выбором"
 */
class SelectionSortTest {

    @Test
    void selectionSort() {
        int[][] input = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };

        int[][] expectedOutput = {
                {},
                {1},
                {0, 1, 2, 3},
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 123},
        };

        for (int[] arr : input) {
            SelectionSort.selectionSort(arr);
        }

        assertArrayEquals(expectedOutput, input);

    }
}