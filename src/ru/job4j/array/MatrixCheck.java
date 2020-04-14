package ru.job4j.array;

/**
 * MatrixCheck.
 *
 * @author Evgeniy Lymar.
 */
public class MatrixCheck {
    /**
     * Method monoHorizontal.
     *
     * @param board array elements.
     * @param row   index of string filled with 'X'.
     * @return result checking.
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Method monoVertical.
     *
     * @param board array elements
     * @param column index of column filled with 'X'.
     * @return result checking.
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}