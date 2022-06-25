package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(nameClass() + "Летает по воздуху.");

    }

    @Override
    public String nameClass() {
        return "Airplane ";
    }
}
