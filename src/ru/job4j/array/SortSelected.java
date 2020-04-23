package ru.job4j.array;

/**
 * SortSelected.
 * @autor Evgeniy Lymar.
 */
public class SortSelected {
    /**
     * Method sort.
     * @param data array elements.
     * @return return sorted elements.
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            if (data[i] > min) {
                int temp = data[index];
                data[index] = data[i];
                data[i] = temp;
            }
        }
            return data;
    }
}
