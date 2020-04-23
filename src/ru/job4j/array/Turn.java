package ru.job4j.array;

/**
 * Turn.
 * @author Evgeniy Lymar
 */
public class Turn {
    /**
     * Method back
     * @param array array elements.
     * @return Turn array.
     */
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
            return array;
    }
}
