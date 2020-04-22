package ru.job4j.array;

public class SortingCheck {
    public static boolean increase(int[] array) {
        boolean result = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
