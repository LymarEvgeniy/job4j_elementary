package ru.job4j.condition;

/**
 * Maximum variable values.
 *
 * @author Evgeniy Lymar.
 */
public class Max {
    /**
     * Method max calculates the maximum values of two variable.
     *
     * @param left  value of the first variable.
     * @param right value of the second variable.
     * @return calculation result.
     */
    public int max(int left, int right) {
        return Math.max(left, right);
    }

    /**
     * Method max calculates the maximum values of three variable.
     *
     * @param first  value of the first variable.
     * @param second value of the second variable.
     * @param third  value of the third variable.
     * @return calculation result.
     */
    public int max(int first, int second, int third) {
        return max(first,
                max(second, third)
        );
    }

    /**
     * Method max calculates the maximum values of four variable.
     *
     * @param first  value of the first variable.
     * @param second value of the second variable.
     * @param third  value of the third variable.
     * @param fourth value of the fourth variable.
     * @return calculation result.
     */
    public int max(int first, int second, int third, int fourth) {
        return max(first,
                max(second, third, fourth)
        );
    }
}
