package org.example.LibraryManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System!");
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        for(String cmd: input) {
            switch(cmd) {
                case "create_library":
                case "add_book":
            }
        }
    }
}
