package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        int time = array[1];
        array[1] = array[2];
        array[2] = time;
        int rev = array[3];
        array[3] = array[4];
        array[4] = rev;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}