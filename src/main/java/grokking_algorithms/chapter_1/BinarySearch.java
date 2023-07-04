package grokking_algorithms.chapter_1;

/**
 * Содержит методы, выполняющий поиск значений по алгоритму "Быстрой сортировки"
 */
public class BinarySearch {

    public static final int UNSUCCESSFUL = -1;

    /**
     * Метод реализует алгоритм "Бинарный поиск".
     * Метод принимает на вход отсортированный массив целочисленных значений и элемент, индекс которого в массиве необходимо получить.
     * Если список содержит число - метод вернет его индекс. В обратном случае система вернет значение <i>-1</i>
     *
     * @param arr Отсортированный массив
     * @param elem Число, индекс которого нужно получить
     * @return Индекс числа elem в массиве arr
     */
    public static int binarySearch (int[] arr, int elem) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guess == elem)
                return mid;

            if (guess > elem)
                high = mid - 1;

            if (guess < elem)
                low = mid + 1;
        }

        return UNSUCCESSFUL;
    }
}
