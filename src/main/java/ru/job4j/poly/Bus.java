package ru.job4j.poly;

public class Bus implements Transport {

    private int passeng;

    @Override
    public void drive() {
        System.out.println("drive()");
    }

    @Override
    public void passenger(int passeng) {
        passeng = 3;

    }

    @Override
    public int refuel(int passeng) {
        int price = 0;
        return price;
    }
}
