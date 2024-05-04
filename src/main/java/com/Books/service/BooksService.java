package com.Books.service;

import com.Books.exception.BookNotFoundException;
import com.Books.model.Books;
import com.Books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import java.util.List;

@Service
public class BooksService {

    private final BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    // Get all books
    public List<Books> getAllBooks() {
        return (List<Books>) booksRepository.findAll();
    }

    // Get a single book by ID
    public Books getBookById(int bookId) {
        return booksRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Entered book ID: " + bookId + " is not available, please enter a valid book ID"));
    }

    // Create a new book
    public Books createBook(@Valid Books book) {
        return booksRepository.save(book);
    }

    // Delete a book by ID
    public void deleteBook(int bookId) {
        Books book = booksRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Entered book ID: " + bookId + " is not available, please enter a valid book ID"));
        booksRepository.delete(book);
    }


}
