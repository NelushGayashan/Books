package com.Books.controller;

import com.Books.exception.BookNotFoundException;
import com.Books.model.Books;
import com.Books.repository.BooksRepository;
import com.Books.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    // Get all books
    @GetMapping
    public List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    // Get a single book by ID
    @GetMapping("/{id}")
    public ResponseEntity<Books> getBookById(@PathVariable(value = "id") int bookId) {
        Books book = booksService.getBookById(bookId);
        return ResponseEntity.ok(book);
    }

    // Create a new book
    @PostMapping
    public ResponseEntity<Books> createBook(@Valid @RequestBody Books book) {
        Books createdBook = booksService.createBook(book);
        return ResponseEntity.ok(createdBook);
    }

    // Delete a book by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") int bookId) {
        booksService.deleteBook(bookId);
        return ResponseEntity.ok().build();
    }


}

