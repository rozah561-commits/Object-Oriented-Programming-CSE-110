/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.innerclass;
import java.util.ArrayList;
import java.util.List;

class Library {
    private String name;
    private String address;
    private List<Book> books;
    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
    }
    public void addBook(String title, String author, String isbn) {
        Book newBook= new Book(title, author, isbn);
        books.add(newBook);
    }
    public void displayBooks() {
        System.out.println("Library: " + name + "  Address: " + address);
        if (books.isEmpty()) {
            System.out.println("No books in this library.");
        } else {
            for (Book book : books) {
                book.displayDetails();
            }
        }
    }
    private class Book {
        private String title;
        private String author;
        private String isbn;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }
        
        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);

        }
    }
}

public class LibraryTest {
    public static void main(String[] args) {

        Library l1 = new Library("Central Library", "123 Main St");
        Library l2= new Library("City Library", "45 City Ave");

        l1.addBook("Java Programming", "James Gosling", "1234567890");
        l1.addBook("Data Structures", "Robert Lafore", "0987654321");

        l2.addBook("Effective Java", "Joshua Bloch", "1122334455");
        l2.addBook("Clean Code", "Robert C. Martin", "6677889900");

        l1.displayBooks();
        l2.displayBooks();
    }
}


