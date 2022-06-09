package ru.job4j.poly;

public class Bus implements Transport {

    private int passeng;

    @Override
    public void drive() {
    }

    @Override
    public void passenger(int passeng) {
    }

    @Override
    public int refuel(int passeng) {
        int price = 0;
        return price;
    }
}
