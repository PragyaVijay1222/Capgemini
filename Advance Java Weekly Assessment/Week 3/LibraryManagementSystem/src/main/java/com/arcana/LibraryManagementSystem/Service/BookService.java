package com.arcana.LibraryManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arcana.LibraryManagementSystem.Model.Book;
import com.arcana.LibraryManagementSystem.Repository.BookRepository;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

	@Autowired
	private final BookRepository repository;
	
	public BookService(BookRepository repository) {
		this.repository = repository;
	}
	
	public void addBook(Book book) {
		repository.addBook(book);
	}
	
	public List<Book> getAllBooks(){
		return repository.getAllBooks();
	}
	
	public Optional<Book> getBookById(Long id){
		return repository.viewBookById(id);
	}
	
	public void deleteBookById(Long id) {
		repository.deleteBookById(id);
	}
}
