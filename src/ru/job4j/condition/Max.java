package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean candition = left >= right;
        int result = candition ? left : right;
        return result;
    }
}
