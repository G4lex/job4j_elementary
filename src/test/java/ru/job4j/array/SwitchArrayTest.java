package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {8, 2, 3, 4, 5, 6, 7, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 2;
        int dest = input.length - 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 5, 4, 3, 6, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 1;
        int dest = input.length -2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 7, 3, 4, 5, 6, 2, 8};
        Assert.assertArrayEquals(expected, result);
    }
}