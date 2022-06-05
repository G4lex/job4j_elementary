package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Clean code", 234);
        Book second = new Book("Name of Glory", 400);
        Book third = new Book("On the Moon", 256);
        Book fourth = new Book("Fourth wheels", 4);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int index = 0; index < books.length; index++) {
            Book bks = books[index];
            System.out.println(bks.getNameOfBook() + " page : " + bks.getPage());
        }
        System.out.println("swipe 0 to 3 index\n");

        for (int index = 0; index < books.length; index++) {
            if (index == 0) {
                Book temp = books[index];
                books[index] = books[index + 3];
                books[index + 3] = temp;
            }
            Book bks = books[index];
            System.out.println(bks.getNameOfBook() + " page : " + bks.getPage());
        }
        System.out.println("Shown only \"Clean code\"\n");
        for (int index = 0; index < books.length; index++) {
            Book bks = books[index];
            if (bks.getNameOfBook().equals("Clean code")) {
                System.out.println(bks.getNameOfBook() + " page : " + bks.getPage());
            }
        }
    }
}
