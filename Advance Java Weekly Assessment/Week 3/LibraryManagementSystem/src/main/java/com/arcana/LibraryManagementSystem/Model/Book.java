package com.arcana.LibraryManagementSystem.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Component
@Scope("prototype")
public class Book {
	
	private Long id;
	
	@NotBlank(message="Title is required")
	private String title;
	
	@NotBlank(message="Author is required")
	private String author;
	
	@Min(value=1, message="Price should be greater than 0")
	private double price;
	
	public Book() {
		
	}
	
	public Book(Long id, String title, String author, double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
