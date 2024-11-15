package org.example.LibraryManagementSystem.repository;

import org.example.LibraryManagementSystem.BookCopy;

import java.util.HashMap;
import java.util.Map;


public class BookCopyRepo {
    Map<String, BookCopy> bookItems = new HashMap<>();

    public void save(String id, BookCopy bookCopy) {
        bookItems.put(id, bookCopy);
    }

    public BookCopy get(String id) {
        return bookItems.get(id);
    }

    public void removeCopy(String id) {
        bookItems.remove(id);
    }


}
