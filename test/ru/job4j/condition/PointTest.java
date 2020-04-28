package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void whenDistance0020() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance1243() {
        Point a = new Point(1, 2);
        Point b = new Point(4, 3);
        double expected = 3.16;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance3574() {
        Point a = new Point(3, 5);
        Point b = new Point(7, 4);
        double expected = 4.12;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance3D354745() {
        Point a = new Point(3, 5, 4);
        Point b = new Point(7, 4, 5);
        double expected = 4.24;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance3D123321() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(3, 2, 1);
        double expected = 2.82;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}