package com.arcana.LibraryManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arcana.LibraryManagementSystem.Exception.BookDoesNotExists;
import com.arcana.LibraryManagementSystem.Model.Book;
import com.arcana.LibraryManagementSystem.Service.BookService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @ModelAttribute("book")
    public Book getBook() {
        return new Book();
    }

    @GetMapping("/add")
    public String showAddForm() {
        return "book-form";
    }

    @PostMapping("/save")
    public String saveBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {

        if (result.hasErrors()) {
            return "book-form";
        }

        service.addBook(book);
        return "redirect:/books/list";
    }

    @GetMapping("/list")
    public String listBooks(Model model) {
        model.addAttribute("books", service.getAllBooks());
        return "view-books";
    }

    @GetMapping("/view/{id}")
    public String viewBook(@PathVariable Long id, Model model) {

        Book book = service.getBookById(id).orElseThrow(() -> new BookDoesNotExists("Book with ID " + id + " not found"));

        model.addAttribute("book", book);
        return "book-details";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {

        service.getBookById(id).orElseThrow(() -> new BookDoesNotExists("Book with ID " + id + " not found"));

        service.deleteBookById(id);
        return "redirect:/books/list";
    }
}