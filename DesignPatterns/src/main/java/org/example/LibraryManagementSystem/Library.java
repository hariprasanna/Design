package org.example.LibraryManagementSystem;

import java.util.List;

public class Library {
    String id;
    List<BookCopy> books;
    int noOfRacks;

    private static Library library;

    private Library() {}

    public static Library getLibrary() {
        if(library == null) {
            synchronized (Library.class) { // To make it thread-safe
                if (library == null) {
                    library = new Library();
                }
            }
        }
        return library;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<BookCopy> getBooks() {
        return books;
    }

    public void setBooks(List<BookCopy> books) {
        this.books = books;
    }

    public int getNoOfRacks() {
        return noOfRacks;
    }

    public void setNoOfRacks(int noOfRacks) {
        this.noOfRacks = noOfRacks;
    }
}
