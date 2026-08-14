package com.isaachome.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book;

    @BeforeEach
    void setUp() {
        this.book = new Book("Java in Action","John Doe",10);
    }

    @Test
    @DisplayName("Test Save Book with zero or less than , will throw error")
    void saveBookWithPageLessZero(){
        Assertions.assertThrows(IllegalArgumentException.class,()->new Book("Java in Action","John Doe",-1));
    }

    @Test
    @DisplayName("Test Borrow Book")
    void borrowBook(){
        Assertions.assertTrue(this.book.borrowBook(this.book));
    }
    @Test
    @DisplayName("Test return Book")
    void returnBook(){
        Assertions.assertFalse(this.book.returnBook(this.book));
    }

}