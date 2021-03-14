package com.company;

public class Author {
    private String authorName;
    private Book[] books = new Book[5];

    Author(String authorName) {
        this.authorName = authorName;
        books[1] = new Book(this.authorName, authorName + "_book_1");
        books[2] = new Book(this.authorName, authorName + "_book_2");
        books[3] = new Book(this.authorName, authorName + "_book_3");
        books[4] = new Book(this.authorName, authorName + "_book_4");
    }

    public Book getBook(String name) {
        for (int i=1; i<books.length; i++) {
            if (name.equals(books[i].getBookName())) {
                System.out.println("Find this book");
                return books[i];
            }
        }
        System.out.println("Not find this book");
        return null;
    }
}
