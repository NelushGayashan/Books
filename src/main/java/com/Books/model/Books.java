package com.Books.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Book Title cannot be blank")
    private String title;

    @NotBlank(message = "Author Name cannot be blank")
    private String authorName;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Author Email cannot be blank")
    private String authorEmail;

    @Positive(message = "Price must be a positive value")
    private double price;

    // Constructors
    public Books() {
        // Default constructor
    }

    public Books(String title, String authorName, String authorEmail, double price) {
        this.title = title;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.price = price;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
