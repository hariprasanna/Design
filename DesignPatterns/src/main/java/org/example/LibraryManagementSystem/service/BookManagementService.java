package org.example.LibraryManagementSystem.service;

import org.example.LibraryManagementSystem.Book;
import org.example.LibraryManagementSystem.BookCopy;
import org.example.LibraryManagementSystem.Library;
import org.example.LibraryManagementSystem.repository.BookCopyRepo;
import org.example.LibraryManagementSystem.repository.BookRepo;
import org.example.LibraryManagementSystem.utils.BookUtils;

import java.util.*;

public class BookManagementService {
    BookUtils bookUtils;
    BookRepo bookRepo;
    BookCopyRepo bookCopyRepo;
    RackManagemetService rackManagemetService;

    BookManagementService() {
        bookUtils = new BookUtils();
        bookRepo = new BookRepo();
        bookCopyRepo = new BookCopyRepo();
        rackManagemetService =  new RackManagemetService();
    }

    void addBook(String bookId, String title, String authors, String publishers, String copyIds) {
        int rack = 1;
        int totalRacks = Library.getLibrary().getNoOfRacks();
        List<String> authorList = bookUtils.fetchListFromCSL(authors);
        List<String> publisherList = bookUtils.fetchListFromCSL(publishers);
        List<String> copyIdList = bookUtils.fetchListFromCSL(copyIds);
        Book book = new Book();
        book.setBookId(bookId);
        book.setTitle(title);
        book.setAuthor(authorList);
        book.setPublisher(publisherList);
        book.setCopyIds(copyIdList);

        Map<String, BookCopy> bookCopies = new HashMap<>();
        for(String id : copyIdList) {
            if(rack <= totalRacks) {
                BookCopy bookCopy = new BookCopy();
                bookCopy.setCopyId(id);
                bookCopy.setCreatedAt(new Date());
                bookCopy.setCreatedAt(new Date());
                bookCopy.setRack(rack);
                book.getRackNos().add(rack);
                bookCopies.put(id, bookCopy);
                bookCopyRepo.save(id, bookCopy);
                rack += 1;
                Library.getLibrary().getBooks().add(bookCopy);
            } else {
                System.out.println("Not enough racks to place the book");
            }
        }
        bookRepo.save(bookId, book);
    }

    void removeBookCopy(String copyId) {
        BookCopy bookCopy = bookCopyRepo.get(copyId);
        String bookId = bookCopy.getBookId();
        bookCopyRepo.removeCopy(copyId);
        bookRepo.removeCopy(bookId, copyId, bookCopy.getRack());
        Library.getLibrary().getBooks().remove(bookCopy);
        //rackManagemetService.removeFromRack(bookCopy);
    }

}
