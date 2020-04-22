package ru.job4j.array;

public class SameElements {
    public static void main(String[] args) {
        int[] one = new int[] {1, 2, 4, 6};
        int[] two = new int[] {3, 1, 5, -4, 6};
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < two.length; j++) {
                if (one[i] == two[j]) {
                    System.out.println(one[i]);
                }
            }
        }
    }
}