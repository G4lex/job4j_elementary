package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Max;

public class MaxTest {


    @Test
    public void whenMax2To1ThenLeftmax() {
        int left = 2;
        int right = 1;
        int result = Max.left(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To3ThenRightmax() {
        int left = 1;
        int right = 3;
        int result = Max.equal(right, left);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To3ThenEqual() {
        int left = 3;
        int right = 3;
        int result = Max.equal(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

}
