package ru.job4j.array;

/**
 * BarleyBreak.
 *
 * @author Evgeniy Lymar.
 */

public class BarleyBreak {
    /**
     * Main.
     * @param args args.
     */
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = k++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
                System.out.println();
        }
    }
}
