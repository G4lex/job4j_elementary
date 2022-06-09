package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        String question = sc.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println("да.");
                break;
            case 1:
                System.out.println("нет");
                break;
            case 2:
            case 3:
                System.out.println("Может быть.");
                break;
            default:
                break;
        }
    }
}