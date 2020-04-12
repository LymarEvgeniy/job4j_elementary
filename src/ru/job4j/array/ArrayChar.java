/**
 * ArrayChar.
 * @autor Evgeniy Lymar.
 */
package ru.job4j.array;

public class ArrayChar {
    /**
     * Method startsWith.
     * @param word array word.
     * @param pref array pref.
     * @return result of comparing the beginning of arrays word and pref.
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length && i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
