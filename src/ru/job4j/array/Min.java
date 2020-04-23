package ru.job4j.array;
/**
 * Min.
 * @autor Evgeniy Lymar.
 */
public class Min {
    /**
     * Method findMin.
     * @param array array elements.
     * @return return the minimum array elements.
     */
        public static int findMin(int[] array) {
            int min = array[0];
            for (int index = 0; index < array.length; index++) {
                min = min < array[index] ? min : array[index];
                }
            return min;
        }
    }
