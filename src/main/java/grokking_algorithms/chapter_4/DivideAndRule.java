package grokking_algorithms.chapter_4;

import java.util.Arrays;

public class DivideAndRule {
    /**
     * Подсчет суммы элементов массива по алгоритму разделяй и властвуй
     */
    public static int sum (int[] array) {
        if (array.length == 0)
            return 0;
        else if (array.length == 1)
            return array[0];
        else
            return sum(Arrays.copyOf(array, array.length / 2)) + sum(Arrays.copyOfRange(array, array.length / 2, array.length));
    }

    /**
     * Подсчет количества элементов массива по алгоритму разделяй и властвуй
     */
    public static int count (int[] array) {
        if (array.length == 0)
            return 0;
        else if (array.length == 1)
            return 1;
        else
            return count(Arrays.copyOf(array, array.length / 2)) + count(Arrays.copyOfRange(array, array.length / 2, array.length));
    }

    /**
     * Подсчет количества элементов массива по алгоритму разделяй и властвуй
     */
    public static int max (int[] array) {
        if (array.length == 0)
            return 0;
        else if (array.length == 1)
            return array[0];
        else {
            int first = max(Arrays.copyOf(array, array.length / 2));
            int second = max(Arrays.copyOfRange(array, array.length / 2, array.length));
            return Math.max(first, second);
        }
    }
}
