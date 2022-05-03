package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return diff(first, second) + division(first, second);
    }

    public static double abs(double first, double second) {
        return sumAndMultiply(first, second) + diffAndDiv(first, second);

    }

    public static void main(String[] args) {
        System.out.println("The calculation result is: " + sumAndMultiply(10, 20));
        System.out.println("The calculation result is: " + diffAndDiv(10, 20));
        System.out.println("The calculation result is: " + abs(10, 20));
    }
}