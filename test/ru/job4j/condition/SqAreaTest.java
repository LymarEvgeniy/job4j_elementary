package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP4K1() {
        int p = 4;
        int k = 1;
        double expented = 1.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expented, out, 0.01);
    }
    @Test
    public void whenP6K2() {
        int p = 6;
        int k = 2;
        double expented = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expented, out, 0.01);
    }
}