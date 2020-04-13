/**
 * MinDiapason.
 * @autor Evgeniy Lymar.
 */
package ru.job4j.array;

public class MinDiapason {
    /**
     * Method findMin.
     * @param array array elements.
     * @param start start array range.
     * @param finish finish array range.
     * @return return the minimum elements in an array range.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            min = min < array[i] ? min : array[i];
        }
        return min;
    }
}
