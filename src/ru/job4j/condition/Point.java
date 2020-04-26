package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Point. Describes a point in a coordinate system.
 * @author Evgeniy lymar.
 */
public class Point {
    /**
     * object field "x".
     */
    private  int x;
    /**
     * object field "y".
     */
    private  int y;
    /**
     * initial state constructor
     * @param first initial state "x".
     * @param second initial state "y".
     */
     public Point(int first, int second) {
         this.x = first;
         this.y = second;
     }
    /**
     * Method distance takes a variable Point.
     * @param that the variable with which we get the value.
     * @return calculation result.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    /**
     * Method main. Demonstration of the exchange method.
     * @param args args
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
     }
}

