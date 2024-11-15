package org.example.LibraryManagementSystem.service;

import org.example.LibraryManagementSystem.Book;
import org.example.LibraryManagementSystem.BookCopy;
import org.example.LibraryManagementSystem.repository.BookCopyRepo;
import org.example.LibraryManagementSystem.repository.BookRepo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SearchService {

    BookRepo bookRepo;

    public SearchService() {
        bookRepo = new BookRepo();
    }

    List<Book> searchBasedOnBookId(String bookId){
        return Collections.singletonList(bookRepo.get(bookId));
    }

    List<Book> searchOnTitle(String title){
        return bookRepo.getBasedOnTitle(title);
    }

    List<Book> searchOnAuthor(String author) {
        return bookRepo.getBasedOnAuthor(author);
    }

    List<Book> searchOnPublisher(String publisher) {
        return bookRepo.getBasedOnPublisher(publisher);
    }

}