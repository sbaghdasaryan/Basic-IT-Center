package com.company;

public class Main5 {

    public static void main(String[] args) {
        Author author1 = new Author("Gago1");
        Author author2 = new Author("Gago2");

        author1.getBook("Gago1_book_3");
        author2.getBook("Gago1_book_3");
    }
}
