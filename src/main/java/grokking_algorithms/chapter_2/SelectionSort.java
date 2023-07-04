package grokking_algorithms.chapter_2;

/**
 * Содержит методы, выполняющий поиск значений по алгоритму "Быстрой сортировки".
 * <p>
 * В виду различия используемых языков в программирования в книге и в проекте ниже приведен код сортировки выбором в ином представлении
 */
public class SelectionSort {

    /**
     * Метод выполняем сортировку массива по алгоритму "Сортировка слиянием"
     *
     * @param source Сортируемый массив
     */
    public static void selectionSort (int[] source) {
        for (int i = 0; i < source.length; i++) {
            int index = i;
            int minElem = source[i];
            for (int j = i + 1; j < source.length; j++) {
                if (source[j] < minElem) {
                    index = j;
                    minElem = source[j];
                }
            }
            source[index] = source[i];
            source[i] = minElem;
        }
    }
}
