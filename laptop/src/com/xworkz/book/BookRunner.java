package com.xworkz.book;

public class BookRunner {
    public static void main(String[] args) {
        BookImpl book = new BookImpl();

        book.openBook();
        book.readBook();
        book.closeBook();

        System.out.println(Book.title);
        System.out.println(Book.pages);
    }
}
