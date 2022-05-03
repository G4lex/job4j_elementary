package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
         Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to50then5() {
        double expected = 5;
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to16then14dot31() {
        double expected = 14.31;
        int x1 = 3;
        int y1 = 2;
        int x2 = 0;
        int y2 = 16;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to68then7dot07() {
        double expected = 7.07;
        int x1 = 1;
        int y1 = 3;
        int x2 = 6;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}