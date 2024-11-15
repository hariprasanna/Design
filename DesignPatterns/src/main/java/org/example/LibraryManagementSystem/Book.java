package org.example.LibraryManagementSystem;

import java.util.List;
import java.util.Map;

public class Book {
    String bookId;
    String title;
    List<String> author;
    List<String> publisher;
    List<String> copyIds;
    List<Integer> rackNos;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public List<String> getPublisher() {
        return publisher;
    }

    public void setPublisher(List<String> publisher) {
        this.publisher = publisher;
    }

    public List<String> getCopyIds() {
        return copyIds;
    }

    public void setCopyIds(List<String> copyIds) {
        this.copyIds = copyIds;
    }

    public List<Integer> getRackNos() {
        return rackNos;
    }

    public void setRackNos(List<Integer> rackNos) {
        this.rackNos = rackNos;
    }
}
