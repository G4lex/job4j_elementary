package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int strk = 0; strk < height; strk++) {
            for (int stolb = 0; stolb < width; stolb++) {

                if (stolb < width) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}