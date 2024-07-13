# Books Management System

## Description
The Books Management System is a simple Spring MVC application for managing books, providing basic CRUD operations (Create, Read, Update, Delete).

## Table of Contents
- [Description](#description)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Exception Handling](#exception-handling)
- [Contributing](#contributing)
- [License](#license)

## Description
The Books Management System is developed using Spring MVC, providing RESTful services to manage books stored in a database. It allows users to perform CRUD operations on books, ensuring efficient management of book records.

## Features
- **CRUD Operations:** Create, Read, Update, and Delete book records.
- **Validation:** Input validation for book details such as title, author name, email, and price.
- **Exception Handling:** Custom exception handling for scenarios like book not found or validation errors.
- **RESTful API:** Exposes RESTful endpoints for seamless integration with front-end applications.
- **Persistence:** Uses Spring Data JPA with Hibernate to interact with the underlying database.

## Technologies Used
- Java
- Spring Framework (Spring MVC, Spring Boot)
- Spring Data JPA
- Hibernate
- Maven
- MySQL (or your preferred database)
- Tomcat (Embedded in Spring Boot)

## Installation
1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/BooksManagementSystem.git
   cd BooksManagementSystem

2.  **Set up the database:**
        Create a MySQL database named booksdb (or modify application.properties to use your preferred database).

3.  **Configure database credentials:**
        Open src/main/resources/application.properties and configure your database username, password, and connection URL.

4.  **Build and run the application:**

    ```bash
    mvn spring-boot:run

5.  **Access the application:**
        The application will be accessible at http://localhost:8080.

## Usage
**API Endpoints**

- Get all books: GET /books
- Get a book by ID: GET /books/{id}
- Create a new book: POST /books
- Delete a book by ID: DELETE /books/{id}

**Example Requests**

- Get all books:

    ```bash
curl http://localhost:8080/books

- Get a book by ID:

    ```bash
curl http://localhost:8080/books/1

- Create a new book:
- 
    ```bash
curl -X POST -H "Content-Type: application/json" -d '{"title":"Sample Book","authorName":"John Doe","authorEmail":"john.doe@example.com","price":29.99}' http://localhost:8080/books

- Delete a book by ID:

    ```bash
    curl -X DELETE http://localhost:8080/books/1

## Endpoints

- GET /books: Retrieves all books.
- GET /books/{id}: Retrieves a book by its ID.
- POST /books: Creates a new book.
- DELETE /books/{id}: Deletes a book by its ID.

## Exception Handling

- BookNotFoundException: Thrown when a requested book is not found.
- MethodArgumentNotValidException: Thrown when input validation fails (e.g., missing fields or invalid email format).

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your improvements.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
