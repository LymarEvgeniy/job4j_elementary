package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenTriangleExistThatArea() {
        Point a = new Point(2, 5);
        Point b = new Point(3, 2);
        Point c = new Point(4, 4);
        Triangle triangle = new Triangle(a, b, c);
        double actual = triangle.area();
        double expected = 2.5;
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenTriangleNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(4, 4);
        Triangle triangle = new Triangle(a, b, c);
        double actual = triangle.area();
        double expected = -1;
        Assert.assertEquals(expected, actual, 0.01);
    }
}