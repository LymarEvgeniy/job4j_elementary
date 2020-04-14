package ru.job4j.array;

/**
 * Multiplication table
 * @author Evgeniy Lymar.
 */
public class Matrix {
    /**
     * Method multiple.
     * @param size table size.
     * @return calculation result.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int k = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}