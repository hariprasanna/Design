package org.example.LibraryManagementSystem.repository;

import org.example.LibraryManagementSystem.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepo {
    Map<String, Book> books = new HashMap<>();

    public void save(String id, Book book) {
        books.put(id, book);
    }

    public Book get(String id) {
        return books.get(id);
    }

    public List<Book> getBasedOnAuthor(String author) {
        List<Book> result = new ArrayList<>();
        books.forEach((id, book) -> {
            if(book.getAuthor().contains(author)) result.add(book);
        });
        return result;
    }

    public List<Book> getBasedOnPublisher(String publisher) {
        List<Book> result = new ArrayList<>();
        books.forEach((id, book) -> {
            if(book.getPublisher().contains(publisher)) result.add(book);
        });
        return result;
    }

    public List<Book> getBasedOnTitle(String title) {
        List<Book> result = new ArrayList<>();
        books.forEach((id, book) -> {
            if(book.getTitle().equals(title)) result.add(book);
        });
        return result;
    }

    public void removeCopy(String id, String copyId, Integer rackNo) {
        if(books.containsKey(id) && books.get(id).getCopyIds().contains(copyId)) {
            Book book = books.get(id);
            book.getCopyIds().remove(copyId);
            books.get(copyId).getRackNos().remove(rackNo);
        } else {
            throw new IllegalArgumentException("Book with id " + id + " does not exist");
        }
    }

    public int getFirstEmptyRackNo(String id) {
        int i = 1;
        List<Integer> rackNos = books.get(id).getRackNos();
        for( ; i < rackNos.size() ; i++) {
            if(i != rackNos.get(i)+1) return i;
        }
        return i;
    }

}
