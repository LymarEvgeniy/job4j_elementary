package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
        double one = Point.distance(0, 0, 2, 0);
        double two = Point.distance(1, 2, 4, 3);
        double three = Point.distance(3, 5, 7, 4);
        System.out.println("one (0, 0) to (2, 0) " + one);
        System.out.println("two (1, 2) to (4, 3) " + two);
        System.out.println("three (3, 5) to (7, 4) " + three);
    }
}

