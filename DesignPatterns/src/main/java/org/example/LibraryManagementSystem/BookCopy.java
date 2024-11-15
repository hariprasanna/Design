package org.example.LibraryManagementSystem;

import java.util.Date;

public class BookCopy {
    String copyId;
    int rack;
    Date createdAt;
    Date updatedAt;
    BorrowedInfo borrowedInfo;
    String bookId;

    public String getCopyId() {
        return copyId;
    }

    public void setCopyId(String copyId) {
        this.copyId = copyId;
    }

    public int getRack() {
        return rack;
    }

    public void setRack(int rack) {
        this.rack = rack;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BorrowedInfo getBorrowedInfo() {
        return borrowedInfo;
    }

    public void setBorrowedInfo(BorrowedInfo borrowedInfo) {
        this.borrowedInfo = borrowedInfo;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
