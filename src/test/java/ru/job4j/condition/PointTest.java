package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a1 = new Point(0, 0);
        Point b1 = new Point(2, 0);
        double out = a1.distance(b1);
         Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to50then5() {
        double expected = 5;
        Point a1 = new Point(0, 0);
        Point b1 = new Point(5, 0);
        double out = a1.distance(b1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to16then14dot31() {
        double expected = 14.31;
        Point a1 = new Point(3, 2);
        Point b1 = new Point(0, 16);
        double out = a1.distance(b1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to68then7dot07() {
        double expected = 7.07;
        Point a1 = new Point(1, 3);
        Point b1 = new Point(6, 8);
        double out = a1.distance(b1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3d() {
        double expected = 4.5825;
        Point one = new Point(0, 1, 3);
        Point two = new Point(4, 0, 1);
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.0001);
    }
}