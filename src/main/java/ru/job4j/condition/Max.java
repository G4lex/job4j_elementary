package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public int max(int left, int right, int mid) {
        return max(left, max(right, mid));
    }

    public int max(int left, int right, int mid, int last) {
        return max(left, max(right, max(mid, last)));
    }
}