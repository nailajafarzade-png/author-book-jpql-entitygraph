Book & Author Management API

A simple Spring Boot REST API for managing books and their authors, 
using PostgreSQL and Spring Data JPA.

Features:
- Create authors and books
- Fetch an author by ID (with their list of books, via EntityGraph)
- Fetch all books with their author's name (via join fetch query)
- Uses DTOs (request/response records) to separate API layer from JPA entities
- One-to-many relationship between Author and Book

Tech stack: Java, Spring Boot, Spring Data JPA, PostgreSQL, Lombok
