package org.example.LibraryManagementSystem.service;

import org.example.LibraryManagementSystem.Library;
import org.example.LibraryManagementSystem.repository.LibraryRepo;

import java.util.ArrayList;

public class LibraryManagementService {
    Library libraryRepo;
    public LibraryManagementService() {
        this.libraryRepo = Library.ge;
    }

    void addLibrary(String id, int noOfRacks) {
        Library library = new Library();
        library.setBooks(new ArrayList<>());
        library.setId(id);
        library.setNoOfRacks(noOfRacks);
        libraryRepo.save(id, library);
        System.out.println("Library created");
    }

}
