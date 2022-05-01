package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
       return value / 70;

    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int x = 100;
        float euro = Converter.rubleToEuro(x);
        System.out.println(x + " rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(x);
        System.out.println(x + " rubles are " + dollar + " dollar");
        float euroS = euro / dollar;
        System.out.println(dollar + " dollars are " + euroS + " euro");

    }
}
