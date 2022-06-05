package ru.job4j.pojo;

public class Book {
    private String nameOfBook;
    private int page;

    public Book(String nameOfBook, int page) {
        this.nameOfBook = nameOfBook;
        this.page = page;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
