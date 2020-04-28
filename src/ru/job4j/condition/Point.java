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
    private int x;
    /**
     * object field "y".
     */
    private int y;
    /**
     * object field "z".
     */
    private int z;
    /**
     * initial state constructor for 2D coordinate system.
     * @param first initial state "x".
     * @param second initial state "y".
     */
     public Point(int first, int second) {
         this.x = first;
         this.y = second;
     }

    /**
     * initial state constructor for 3D coordinate system.
     * @param first initial state "x".
     * @param second initial state "y".
     * @param third initial state "z".
     */
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
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
     * Method distance3d takes a variable Point.
     * @param that the variable with which we get the value.
     * @return calculation result.
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
     }
}