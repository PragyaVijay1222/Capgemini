package com.arcana.LibraryManagementSystem.Exception;

public class BookDoesNotExists extends RuntimeException {
    public BookDoesNotExists(String message) {
        super(message);
    }
}