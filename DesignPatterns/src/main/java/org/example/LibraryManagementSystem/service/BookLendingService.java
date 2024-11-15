package org.example.LibraryManagementSystem.service;

import org.example.LibraryManagementSystem.Book;
import org.example.LibraryManagementSystem.BookCopy;
import org.example.LibraryManagementSystem.BookStatus;
import org.example.LibraryManagementSystem.BorrowedInfo;
import org.example.LibraryManagementSystem.repository.BookCopyRepo;
import org.example.LibraryManagementSystem.repository.BookRepo;
import org.example.LibraryManagementSystem.repository.UserRepo;

import java.util.Date;
import java.util.List;

public class BookLendingService {
    BookRepo bookRepo = new BookRepo();
    BookCopyRepo bookCopyRepo = new BookCopyRepo();
    UserRepo userRepo = new UserRepo();
    RackManagemetService rackManagemetService = new RackManagemetService();

    void BookLendingService(BookRepo bookRepo, BookCopyRepo bookCopyRepo) {
        this.bookRepo = bookRepo;
        this.bookCopyRepo = bookCopyRepo;
    }

    void issueBook(String bookId, String userId, Date dueDate) {
        Book book = bookRepo.get(bookId);
        List<String> copyIds = book.getCopyIds();
        copyIds.forEach(copyId -> {
            issueBookCopy(copyId, userId, dueDate);
        });
    }

    void issueBookCopy(String copyId, String userId, Date dueDate) {
        Date currentDate = new Date();
        /*Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        Date newDate = calendar.getTime();*/

        BookCopy copy = bookCopyRepo.get(copyId);
        if(copy.getBorrowedInfo() != null && copy.getBorrowedInfo().getStatus() != BookStatus.AVAILABLE) try {
            throw new Exception("Unaivaible copy");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        BorrowedInfo borrowedInfo = new BorrowedInfo();
        borrowedInfo.setUser(userRepo.getUser(userId));
        borrowedInfo.setStatus(BookStatus.ISSUED);
        borrowedInfo.setIssuedDate(currentDate);
        borrowedInfo.setDueDate(dueDate);
        copy.setBorrowedInfo(borrowedInfo);
        bookCopyRepo.save(copyId, copy);
        //rackManagemetService.removeFromRack(copy); //Donot remove from the racklist. Place it where it is
    }

    void returnBook(String copyId) {
        //TODO: Exception handling
        BookCopy bookCopy = bookCopyRepo.get(copyId);
        bookCopy.getBorrowedInfo().setStatus(BookStatus.AVAILABLE);
        bookCopyRepo.save(copyId, bookCopy);
    }

    void renewBook(String copyId, Date dueDate) {
        //TODO: Exception handling
        BookCopy bookCopy = bookCopyRepo.get(copyId);
        bookCopy.getBorrowedInfo().setStatus(BookStatus.RENEWED);
        bookCopy.getBorrowedInfo().setDueDate(dueDate);
        bookCopyRepo.save(copyId, bookCopy);
    }
}
