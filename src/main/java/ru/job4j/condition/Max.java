package ru.job4j.condition;

public class Max {
    public static int left(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static int right(int left, int right) {
        boolean condition = left < right;
        int result = condition ? right : left;
        return result;
    }

    public static int equal(int left, int right) {
        boolean condition = left == right;
        int result = condition ? right : left;
        return result;
    }

}
