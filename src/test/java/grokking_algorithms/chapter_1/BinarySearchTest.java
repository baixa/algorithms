package grokking_algorithms.chapter_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Юнит-тесты для метода поиска индекса значения в массиве по алгоритмы "Быстрого поиска"
 */
class BinarySearchTest {

    /**
     * Проверяет базовый функционал метода:
     *  <ul>
     *      <li>на вход подается отсортированный список элементов</li>
     *      <li>передается элемент, который ИМЕЕТСЯ в массиве</li>
     *  </ul>
     *  <b>Результат</b>: метод должен вернуть корректное значение индекса элемента в массиве
     */
    @Test
    void binarySearchDefaultBehavior() {
        int[] input = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int searchValue = 5;
        int expectValue = 5;

        assertEquals(expectValue, BinarySearch.binarySearch(input, searchValue));
    }

    /**
     * Проверяет метода бинарного поиска на поведение в случае отсутствия значения в переданном массиве:
     *  <ul>
     *      <li>на вход подается отсортированный список элементов</li>
     *      <li>передается элемент, который ОТСУТСТВУЕТ в массиве</li>
     *  </ul>
     *  <b>Результат</b>: метод должен вернуть значение <i>-1</i> - маркер отсутствия в массиве искомого значения
     */
    @Test
    void binarySearchElemIsAbsentInArray() {
        int[] input = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int searchValue = 68;
        int expectValue = BinarySearch.UNSUCCESSFUL;

        assertEquals(expectValue, BinarySearch.binarySearch(input, searchValue));
    }
}