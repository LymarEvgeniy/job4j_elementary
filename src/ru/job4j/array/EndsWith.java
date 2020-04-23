
package ru.job4j.array;
/**
 * EndsWith.
 * @autor Evgeniy Lymar.
 */
public class EndsWith {
    /**
     * @param word array word.
     * @param post array post.
     * @return comparison result .
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = word.length - 1, j = post.length - 1; (i >= 0) && (j >= 0); i--, j--) {
            if (word[i] != post[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
