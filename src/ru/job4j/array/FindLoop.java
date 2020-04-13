/**
 * FindLoop.
 * @autor Evgeniy Lymar.
 */
package ru.job4j.array;

public class FindLoop {
    /**
     * Method indexOf
     * @param data array of numbers.
     * @param el item to find.
     * @return result find element.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Method indexOf.
     * @param data array of numbers.
     * @param el item to find.
     * @param start index from which to start the search.
     * @param finish index by which we end search.
     * @return result find element.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            for (int j = start; j <= finish; j++) {
                if (data[j] == el) {
                    rst = j;
                }
            }
        }
        return rst;
    }
}
