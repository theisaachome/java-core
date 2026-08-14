package com.isaachome.demo;

public class Book {
    private String title;
    private String author;
    private int pages;
    private boolean isAvailable = true;

    public Book(String title, String author, int pages) {
        if(pages<=0){
            throw new IllegalArgumentException("Pages must be greater than 0");
        }
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public boolean borrowBook(Book book){
        if(book.isAvailable){
            book.isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book){
        if(!book.isAvailable){
            book.isAvailable = true;
            return true;
        }
        return false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
