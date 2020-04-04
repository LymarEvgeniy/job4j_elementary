package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void whenDistance0020() {
        int inX1 = 0;
        int inY1 = 0;
        int inX2 = 2;
        int inY2 = 0;
        double expected = 2.0;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenDistance1243() {
        int inX1 = 1;
        int inY1 = 2;
        int inX2 = 4;
        int inY2 = 3;
        double expected = 3.16;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenDistance3574() {
        int inX1 = 3;
        int inY1 = 5;
        int inX2 = 7;
        int inY2 = 4;
        double expected = 4.12;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
}