package com.arcana.LibraryManagementSystem.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.arcana.LibraryManagementSystem.Model.Book;

@Repository
public class BookRepository {
	
	private List<Book> books = new ArrayList<>();
	private Long idCounter =1L;
	
	public List<Book> getAllBooks(){
		return books;
	}
	
	public Optional<Book> viewBookById(Long id) {
		return books.stream().filter(p -> p.getId().equals(id)).findFirst();
	}
	
	public void deleteBookById(Long id) {
		books.removeIf(p -> p.getId().equals(id));
	}
	
	public void addBook(Book book) {
		if(book.getId() == null) {
			book.setId(idCounter++);
			books.add(book);
		}
	}
}
