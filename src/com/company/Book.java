package com.company;

public class Book {
    private String author;
    private String bookName;

    Book(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }
}
