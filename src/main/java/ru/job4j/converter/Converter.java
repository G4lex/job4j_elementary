package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
       return value / 70;

    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float euro = Converter.rubleToEuro(in);
        System.out.println(in + " rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(in);
        System.out.println(in + " rubles are " + dollar + " dollar");
        float euroS = euro / dollar;
        System.out.println(dollar + " dollars are " + euroS + " euro");

        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(in + "rubles are 2. Test result : " + passed);
            float expected2 = 2.3333333f;
            float out2 = Converter.rubleToDollar(in);
            boolean passed2 = expected2 == out2;
            System.out.println(in + " rubles are " + out2 + " Test result : " + passed2);
           float out3 = euroS;
           float expected3 = 0.85714287f;
           boolean passed3 = expected3 == out3;
           System.out.println(dollar + " dollar are " + out3 + " Test result : " + passed3);

    }
}
