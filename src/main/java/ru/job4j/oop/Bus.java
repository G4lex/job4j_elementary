package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(nameClass() + "Едет по дороге.");
    }

    @Override
    public String nameClass() {
        return "Bus ";
    }
}
