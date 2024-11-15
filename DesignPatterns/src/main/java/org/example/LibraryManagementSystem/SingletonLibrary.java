package org.example.LibraryManagementSystem;

public class SingletonLibrary {
    private static Library instance;
    private SingletonLibrary() {}

    public static SingletonLibrary getInstance() {
        if(instance == null) {
            instance = new SingletonLibrary();
        }
        return instance;
    }
}
