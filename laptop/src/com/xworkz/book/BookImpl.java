package com.xworkz.book;

public class BookImpl  implements Book{
    public void openBook() {
        System.out.println("Book is opened");
    }

    public void readBook() {
        System.out.println("Reading the book");
    }

    public void closeBook() {
        System.out.println("Book is closed");
    }
}
