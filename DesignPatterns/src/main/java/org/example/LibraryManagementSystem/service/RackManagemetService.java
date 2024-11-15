package org.example.LibraryManagementSystem.service;

import org.example.LibraryManagementSystem.BookCopy;
import org.example.LibraryManagementSystem.repository.BookCopyRepo;
import org.example.LibraryManagementSystem.repository.BookRepo;

public class RackManagemetService {
    BookRepo bookRepo = new BookRepo();
    BookCopyRepo bookCopyRepo = new BookCopyRepo();

    void removeFromRack(BookCopy bookCopy) {
        bookRepo.get(bookCopy.getCopyId()).getRackNos().remove(bookCopy.getRack());
    }

    void putBackToRack(BookCopy bookCopy) {
        int i = 0;

    }
}
